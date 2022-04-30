package com.michaldrabik.ui_base

import android.view.View
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.michaldrabik.ui_base.common.ListItem

abstract class BaseAdapter<Item : ListItem> : RecyclerView.Adapter<RecyclerView.ViewHolder>(), AsyncListDiffer.ListListener<Item> {

  abstract val asyncDiffer: AsyncListDiffer<Item>

  var missingImageListener: (Item, Boolean) -> Unit = { _, _ -> }
  var missingTranslationListener: (Item) -> Unit = { _ -> }
  var itemClickListener: (Item) -> Unit = { }
  var listChangeListener: () -> Unit = { }

  private var notifyChange = false

  open fun setItems(newItems: List<Item>, notifyChange: Boolean = false) {
    this.notifyChange = notifyChange
    with(asyncDiffer) {
      removeListListener(this@BaseAdapter)
      addListListener(this@BaseAdapter)
      submitList(newItems)
    }
  }

  override fun getItemCount() = asyncDiffer.currentList.size

  fun getItems(): List<Item> = asyncDiffer.currentList

  fun indexOf(item: Item) = asyncDiffer.currentList.indexOfFirst { it.isSameAs(item) }

  override fun onCurrentListChanged(
    previousList: MutableList<Item>,
    currentList: MutableList<Item>,
  ) {
    if (notifyChange) {
      listChangeListener()
    }
  }

  class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
