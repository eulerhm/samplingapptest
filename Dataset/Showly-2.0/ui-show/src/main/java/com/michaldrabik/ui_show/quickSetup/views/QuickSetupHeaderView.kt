package com.michaldrabik.ui_show.quickSetup.views

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import com.michaldrabik.ui_model.Season
import com.michaldrabik.ui_show.R
import kotlinx.android.synthetic.main.view_quick_setup_header.view.*
import java.util.Locale

class QuickSetupHeaderView : FrameLayout {

  constructor(context: Context) : super(context)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

  init {
    inflate(context, R.layout.view_quick_setup_header, this)
    layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
  }

  fun bind(season: Season) {
    viewQuickSetupHeaderTitle.text =
      String.format(Locale.ENGLISH, context.getString(R.string.textSeason), season.number)
  }
}
