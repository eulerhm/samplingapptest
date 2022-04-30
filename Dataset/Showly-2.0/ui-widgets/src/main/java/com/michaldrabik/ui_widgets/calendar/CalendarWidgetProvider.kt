package com.michaldrabik.ui_widgets.calendar

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetManager.ACTION_APPWIDGET_UPDATE
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.RemoteViews
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import com.michaldrabik.common.Config
import com.michaldrabik.ui_base.utilities.extensions.dimenToPx
import com.michaldrabik.ui_widgets.BaseWidgetProvider
import com.michaldrabik.ui_widgets.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class CalendarWidgetProvider : BaseWidgetProvider() {

  companion object {
    fun requestUpdate(context: Context) {
      val applicationContext = context.applicationContext
      val appWidgetManager = AppWidgetManager.getInstance(applicationContext)
      val intent = Intent(applicationContext, CalendarWidgetProvider::class.java).apply {
        val ids = appWidgetManager.getAppWidgetIds(ComponentName(applicationContext, CalendarWidgetProvider::class.java))
        action = ACTION_APPWIDGET_UPDATE
        putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, ids)
      }
      applicationContext.sendBroadcast(intent)
      Timber.d("Widget update requested.")
    }
  }

  override fun getLayoutResId(): Int {
    val isLight = settingsRepository.widgetsTheme == MODE_NIGHT_NO
    return when {
      isLight -> R.layout.widget_calendar_day
      else -> R.layout.widget_calendar_night
    }
  }

  override fun onUpdate(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetIds: IntArray?,
  ) {
    super.onUpdate(context, appWidgetManager, appWidgetIds)
    appWidgetIds?.forEach { updateWidget(context, appWidgetManager, it) }
  }

  private fun updateWidget(context: Context, appWidgetManager: AppWidgetManager, widgetId: Int) {
    val intent = Intent(context, CalendarWidgetService::class.java).apply {
      putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetId)
      data = Uri.parse(toUri(Intent.URI_INTENT_SCHEME))
    }

    val remoteViews = RemoteViews(context.packageName, getLayoutResId()).apply {
      setRemoteAdapter(R.id.calendarWidgetList, intent)
      setEmptyView(R.id.calendarWidgetList, R.id.calendarWidgetEmptyView)

      val spaceTiny = context.dimenToPx(R.dimen.spaceTiny)
      val paddingTop = if (settings.widgetsShowLabel) context.dimenToPx(R.dimen.widgetPaddingTop) else spaceTiny
      val labelVisibility = if (settings.widgetsShowLabel) VISIBLE else GONE
      setViewPadding(R.id.calendarWidgetList, 0, paddingTop, 0, spaceTiny)
      setViewVisibility(R.id.calendarWidgetLabel, labelVisibility)

      setInt(R.id.calendarWidgetNightRoot, "setBackgroundResource", getBackgroundResId())
      setInt(R.id.calendarWidgetDayRoot, "setBackgroundResource", getBackgroundResId())
    }

    val listClickIntent = Intent(context, CalendarWidgetProvider::class.java).apply {
      action = ACTION_LIST_CLICK
      data = Uri.parse(intent.toUri(Intent.URI_INTENT_SCHEME))
    }

    val listIntent = PendingIntent.getBroadcast(context, 0, listClickIntent, PendingIntent.FLAG_UPDATE_CURRENT)
    remoteViews.setPendingIntentTemplate(R.id.calendarWidgetList, listIntent)

    appWidgetManager.updateAppWidget(widgetId, remoteViews)
    appWidgetManager.notifyAppWidgetViewDataChanged(widgetId, R.id.calendarWidgetList)
  }

  override fun onReceive(context: Context, intent: Intent) {
    if (intent.action == ACTION_LIST_CLICK) {
      when {
        intent.extras?.containsKey(EXTRA_SHOW_ID) == true -> {
          val showId = intent.getLongExtra(EXTRA_SHOW_ID, -1L)
          context.startActivity(
            Intent().apply {
              setClassName(context, Config.HOST_ACTIVITY_NAME)
              putExtra(EXTRA_SHOW_ID, showId.toString())
              flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
          )
        }
      }
    }
    super.onReceive(context, intent)
  }
}
