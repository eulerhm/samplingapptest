package com.woocommerce.android.ui.orders.creation.variations

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class OrderCreationVariationSelectionFragmentArgs(
  public val productId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("productId", this.productId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("productId", this.productId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderCreationVariationSelectionFragmentArgs {
      bundle.setClassLoader(OrderCreationVariationSelectionFragmentArgs::class.java.classLoader)
      val __productId : Long
      if (bundle.containsKey("productId")) {
        __productId = bundle.getLong("productId")
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationVariationSelectionFragmentArgs(__productId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderCreationVariationSelectionFragmentArgs {
      val __productId : Long?
      if (savedStateHandle.contains("productId")) {
        __productId = savedStateHandle["productId"]
        if (__productId == null) {
          throw IllegalArgumentException("Argument \"productId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue")
      }
      return OrderCreationVariationSelectionFragmentArgs(__productId)
    }
  }
}
