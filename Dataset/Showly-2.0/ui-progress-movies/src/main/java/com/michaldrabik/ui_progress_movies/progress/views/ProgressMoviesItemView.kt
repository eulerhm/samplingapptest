package com.michaldrabik.ui_progress_movies.progress.views

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.michaldrabik.ui_base.common.views.MovieView
import com.michaldrabik.ui_base.utilities.extensions.addRipple
import com.michaldrabik.ui_base.utilities.extensions.bump
import com.michaldrabik.ui_base.utilities.extensions.expandTouch
import com.michaldrabik.ui_base.utilities.extensions.gone
import com.michaldrabik.ui_base.utilities.extensions.onClick
import com.michaldrabik.ui_base.utilities.extensions.visibleIf
import com.michaldrabik.ui_progress_movies.R
import com.michaldrabik.ui_progress_movies.progress.recycler.ProgressMovieListItem
import kotlinx.android.synthetic.main.view_progress_movies_main_item.view.*

@SuppressLint("SetTextI18n")
class ProgressMoviesItemView : MovieView<ProgressMovieListItem.MovieItem> {

  constructor(context: Context) : super(context)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

  var itemLongClickListener: ((ProgressMovieListItem.MovieItem, View) -> Unit)? = null
  var checkClickListener: ((ProgressMovieListItem.MovieItem) -> Unit)? = null

  init {
    inflate(context, R.layout.view_progress_movies_main_item, this)
    layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
    addRipple()
    progressMovieItemCheckButton.expandTouch(100)
    onClick { itemClickListener?.invoke(item) }
    setOnLongClickListener {
      itemLongClickListener?.invoke(item, progressMovieItemTitle)
      true
    }
    imageLoadCompleteListener = { loadTranslation() }
  }

  private lateinit var item: ProgressMovieListItem.MovieItem

  override val imageView: ImageView = progressMovieItemImage
  override val placeholderView: ImageView = progressMovieItemPlaceholder

  override fun bind(item: ProgressMovieListItem.MovieItem) {
    this.item = item
    clear()

    val translationTitle = item.translation?.title
    progressMovieItemTitle.text =
      if (translationTitle.isNullOrBlank()) item.movie.title
      else translationTitle

    val translationOverview = item.translation?.overview
    progressMovieItemSubtitle.text =
      when {
        translationOverview.isNullOrBlank() -> {
          if (item.movie.overview.isBlank()) context.getString(R.string.textNoDescription)
          else item.movie.overview
        }
        else -> translationOverview
      }

    progressMovieItemPin.visibleIf(item.isPinned)

    progressMovieItemCheckButton.onClick {
      it.bump { checkClickListener?.invoke(item) }
    }

    loadImage(item)
  }

  private fun loadTranslation() {
    if (item.translation == null) {
      missingTranslationListener?.invoke(item)
    }
  }

  private fun clear() {
    progressMovieItemTitle.text = ""
    progressMovieItemSubtitle.text = ""
    progressMovieItemPlaceholder.gone()
    Glide.with(this).clear(progressMovieItemImage)
  }
}
