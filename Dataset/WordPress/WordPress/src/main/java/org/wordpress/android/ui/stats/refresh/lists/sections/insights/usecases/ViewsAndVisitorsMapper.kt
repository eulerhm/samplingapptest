package org.wordpress.android.ui.stats.refresh.lists.sections.insights.usecases

import org.wordpress.android.R
import org.wordpress.android.R.color
import org.wordpress.android.R.string
import org.wordpress.android.fluxc.model.stats.time.VisitsAndViewsModel.PeriodData
import org.wordpress.android.fluxc.network.utils.StatsGranularity
import org.wordpress.android.fluxc.network.utils.StatsGranularity.DAYS
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.ChartLegendsBlue
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.ChartLegendsPurple
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.Chips
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.Chips.Chip
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.LineChartItem
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.LineChartItem.Line
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.Text
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.Text.Clickable
import org.wordpress.android.ui.stats.refresh.lists.sections.BlockListItem.ValuesItem
import org.wordpress.android.ui.stats.refresh.lists.sections.insights.usecases.ViewsAndVisitorsMapper.SelectedType.Views
import org.wordpress.android.ui.stats.refresh.lists.sections.insights.usecases.ViewsAndVisitorsMapper.SelectedType.Visitors
import org.wordpress.android.ui.stats.refresh.utils.ContentDescriptionHelper
import org.wordpress.android.ui.stats.refresh.utils.MILLION
import org.wordpress.android.ui.stats.refresh.utils.StatsDateFormatter
import org.wordpress.android.ui.stats.refresh.utils.StatsUtils
import org.wordpress.android.ui.utils.ListItemInteraction
import org.wordpress.android.viewmodel.ResourceProvider
import javax.inject.Inject

@Suppress("MagicNumber")
class ViewsAndVisitorsMapper
@Inject constructor(
    private val statsDateFormatter: StatsDateFormatter,
    private val resourceProvider: ResourceProvider,
    private val statsUtils: StatsUtils,
    private val contentDescriptionHelper: ContentDescriptionHelper
) {
    private val units = listOf(
            string.stats_views,
            string.stats_visitors
    )

    enum class SelectedType(val value: Int) {
        Views(0),
        Visitors(1);

        companion object {
            fun valueOf(value: Int): SelectedType? = values().find { it.value == value }
            fun getColor(selectedType: Int): Int = when (selectedType) {
                0 -> color.blue_50
                else -> color.purple_50
            }
            fun getFillDrawable(selectedType: Int): Int = when (selectedType) {
                0 -> R.drawable.bg_rectangle_stats_line_chart_blue_gradient
                else -> R.drawable.bg_rectangle_stats_line_chart_purple_gradient
            }
        }
    }

    fun buildChartLegendsBlue() = ChartLegendsBlue(
            string.stats_timeframe_this_week,
            string.stats_timeframe_previous_week
        )

    fun buildChartLegendsPurple() = ChartLegendsPurple(
            string.stats_timeframe_this_week,
            string.stats_timeframe_previous_week
        )

    fun buildTitle(
        dates: List<PeriodData>,
        statsGranularity: StatsGranularity = DAYS,
        selectedItem: PeriodData,
        selectedPosition: Int,
        startValue: Int = MILLION
    ): ValuesItem {
        val (thisWeekCount, prevWeekCount) = mapDatesToWeeks(dates, selectedPosition)

        return ValuesItem(
                selectedItem = selectedPosition,
                value1 = statsUtils.toFormattedString(thisWeekCount, startValue),
                unit1 = units[selectedPosition],
                contentDescription1 = resourceProvider.getString(
                        string.stats_overview_content_description,
                        thisWeekCount,
                        resourceProvider.getString(units[selectedPosition]),
                        statsDateFormatter.printGranularDate(selectedItem.period, statsGranularity),
                        ""
                ),
                value2 = statsUtils.toFormattedString(prevWeekCount, startValue),
                unit2 = units[selectedPosition],
                contentDescription2 = resourceProvider.getString(
                        string.stats_overview_content_description,
                        prevWeekCount,
                        resourceProvider.getString(units[selectedPosition]),
                        statsDateFormatter.printGranularDate(selectedItem.period, statsGranularity),
                        ""
                )
        )
    }

    private fun PeriodData.getValue(selectedPosition: Int) = when (SelectedType.valueOf(selectedPosition)) {
        Views -> this.views
        Visitors -> this.visitors
        else -> 0L
    }

    @Suppress("LongParameterList")
    fun buildChart(
        dates: List<PeriodData>,
        statsGranularity: StatsGranularity,
        onLineSelected: (String?) -> Unit,
        onLineChartDrawn: (visibleBarCount: Int) -> Unit,
        selectedType: Int,
        selectedItemPeriod: String
    ): List<BlockListItem> {
        val chartItems = dates.map {
            val value = it.getValue(selectedType)
            val date = statsDateFormatter.parseStatsDate(statsGranularity, it.period)
            Line(
                    statsDateFormatter.printDayWithoutYear(date),
                    it.period,
                    value.toInt()
            )
        }

        val result = mutableListOf<BlockListItem>()

        val entryType = when (SelectedType.valueOf(selectedType)) {
            Visitors -> string.stats_visitors
            else -> string.stats_views
        }

        val contentDescriptions = statsUtils.getLineChartEntryContentDescriptions(
                entryType,
                chartItems
        )

        result.add(
                LineChartItem(
                        selectedType = selectedType,
                        entries = chartItems,
                        selectedItemPeriod = selectedItemPeriod,
                        onLineSelected = onLineSelected,
                        onLineChartDrawn = onLineChartDrawn,
                        entryContentDescriptions = contentDescriptions
                )
        )
        return result
    }

    fun buildInformation(
        dates: List<PeriodData>,
        selectedPosition: Int,
        navigationAction: (() -> Unit?)? = null
    ): Text {
        val (thisWeekCount, prevWeekCount) = mapDatesToWeeks(dates, selectedPosition)

        if (thisWeekCount <= 0 || prevWeekCount <= 0) {
            return Text(
                    text = resourceProvider.getString(
                            string.stats_insights_views_and_visitors_visitors_empty_state,
                            EXTERNAL_LINK_ICON_TOKEN
                    ),
                    links = listOf(
                            Clickable(
                                    icon = R.drawable.ic_external_white_24dp,
                                    navigationAction = ListItemInteraction.create(
                                            action = { navigationAction?.invoke() }
                                    )
                            )
                    )
            )
        }

        val positive = thisWeekCount >= prevWeekCount
        val change = statsUtils.buildChange(prevWeekCount, thisWeekCount, positive, true).toString()
        val stringRes = when (SelectedType.valueOf(selectedPosition)) {
            Views -> {
                when {
                    positive -> string.stats_insights_views_and_visitors_views_positive
                    else -> string.stats_insights_views_and_visitors_views_negative
                }
            }
            Visitors -> {
                when {
                    positive -> string.stats_insights_views_and_visitors_visitors_positive
                    else -> string.stats_insights_views_and_visitors_visitors_negative
                }
            }
            else -> string.stats_insights_views_and_visitors_views_positive
        }

        return Text(
                text = resourceProvider.getString(stringRes, change),
                color = when {
                    positive -> mapOf(color.stats_color_positive to change)
                    else -> mapOf(color.stats_color_negative to change)
                }
        )
    }

    fun buildChips(
        onChipSelected: (position: Int) -> Unit,
        selectedPosition: Int
    ): Chips {
        return Chips(
                listOf(
                        Chip(
                                string.stats_views,
                                contentDescriptionHelper.buildContentDescription(
                                        string.stats_views,
                                        0
                                )
                        ),
                        Chip(
                                string.stats_visitors,
                                contentDescriptionHelper.buildContentDescription(
                                        string.stats_visitors,
                                        1
                                )
                        )
                ),
                selectedPosition,
                onChipSelected
        )
    }

    private fun mapDatesToWeeks(dates: List<PeriodData>, selectedPosition: Int): Pair<Long, Long> {
        val values = dates.map {
            val value = it.getValue(selectedPosition)
            value.toInt()
        }

        val hasData = values.isNotEmpty() && values.size >= 7

        val prevWeekData = if (hasData) values.subList(0, 7) else values.subList(0, values.size)
        val thisWeekData = if (hasData) values.subList(7, values.size) else emptyList()

        val prevWeekCount = prevWeekData.fold(0L) { acc, next -> acc + next }
        val thisWeekCount = thisWeekData.fold(0L) { acc, next -> acc + next }

        return Pair(thisWeekCount, prevWeekCount)
    }

    companion object {
        const val EXTERNAL_LINK_ICON_TOKEN = "ICON"
    }
}
