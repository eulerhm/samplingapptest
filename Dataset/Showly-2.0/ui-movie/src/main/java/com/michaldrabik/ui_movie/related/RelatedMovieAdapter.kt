package com.michaldrabik.ui_movie.related

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.michaldrabik.ui_base.BaseMovieAdapter

class RelatedMovieAdapter(
  itemClickListener: (RelatedListItem) -> Unit,
  missingImageListener: (RelatedListItem, Boolean) -> Unit,
) : BaseMovieAdapter<RelatedListItem>(
  itemClickListener = itemClickListener,
  missingImageListener = missingImageListener
) {

  override val asyncDiffer = AsyncListDiffer(this, RelatedItemDiffCallback())

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    ViewHolderShow(
      RelatedMovieView(parent.context).apply {
        itemClickListener = this@RelatedMovieAdapter.itemClickListener
        missingImageListener = this@RelatedMovieAdapter.missingImageListener
      }
    )

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    val item = asyncDiffer.currentList[position]
    (holder.itemView as RelatedMovieView).bind(item)
  }

  class ViewHolderShow(itemView: View) : RecyclerView.ViewHolder(itemView)
}
