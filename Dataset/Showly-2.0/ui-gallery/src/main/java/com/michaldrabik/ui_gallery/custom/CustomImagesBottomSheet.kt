package com.michaldrabik.ui_gallery.custom

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.michaldrabik.ui_base.BaseBottomSheetFragment
import com.michaldrabik.ui_base.utilities.extensions.dimenToPx
import com.michaldrabik.ui_base.utilities.extensions.gone
import com.michaldrabik.ui_base.utilities.extensions.onClick
import com.michaldrabik.ui_base.utilities.extensions.visible
import com.michaldrabik.ui_base.utilities.extensions.withFailListener
import com.michaldrabik.ui_base.utilities.extensions.withSuccessListener
import com.michaldrabik.ui_gallery.R
import com.michaldrabik.ui_model.IdTrakt
import com.michaldrabik.ui_model.ImageFamily
import com.michaldrabik.ui_model.ImageStatus
import com.michaldrabik.ui_model.ImageType
import com.michaldrabik.ui_model.ImageType.FANART
import com.michaldrabik.ui_model.ImageType.POSTER
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_CUSTOM_IMAGE_CLEARED
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_FAMILY
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_MOVIE_ID
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_PICK_MODE
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_SHOW_ID
import com.michaldrabik.ui_navigation.java.NavigationArgs.ARG_TYPE
import com.michaldrabik.ui_navigation.java.NavigationArgs.REQUEST_CUSTOM_IMAGE
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.view_custom_images.*
import kotlinx.android.synthetic.main.view_custom_images.view.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CustomImagesBottomSheet : BaseBottomSheetFragment<CustomImagesViewModel>() {

  private val family by lazy { arguments?.getSerializable(ARG_FAMILY) as ImageFamily }
  private val showTraktId by lazy { IdTrakt(requireArguments().getLong(ARG_SHOW_ID)) }
  private val movieTraktId by lazy { IdTrakt(requireArguments().getLong(ARG_MOVIE_ID)) }

  private val cornerRadius by lazy { requireContext().dimenToPx(R.dimen.customImagesCorner) }

  override val layoutResId = R.layout.view_custom_images

  override fun getTheme(): Int = R.style.CustomBottomSheetDialog

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val contextThemeWrapper = ContextThemeWrapper(activity, R.style.AppTheme)
    return inflater.cloneInContext(contextThemeWrapper).inflate(layoutResId, container, false)
  }

  override fun createViewModel() =
    ViewModelProvider(this).get(CustomImagesViewModel::class.java)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    setupView(view)

    viewLifecycleOwner.lifecycleScope.launch {
      repeatOnLifecycle(Lifecycle.State.STARTED) {
        with(viewModel) {
          launch { uiState.collect { render(it) } }
          loadPoster(showTraktId, movieTraktId, family)
          loadFanart(showTraktId, movieTraktId, family)
        }
      }
    }
  }

  private fun setupView(view: View) {
    view.run {
      viewCustomImagesPosterLayout.onClick { showGallery(POSTER) }
      viewCustomImagesFanartLayout.onClick { showGallery(FANART) }
      viewCustomImagesPosterDelete.onClick { viewModel.deletePoster(showTraktId, movieTraktId, family) }
      viewCustomImagesFanartDelete.onClick { viewModel.deleteFanart(showTraktId, movieTraktId, family) }
      viewCustomImagesCloseButton.onClick { dismiss() }
    }
  }

  private fun showGallery(type: ImageType) {
    val bundle = bundleOf(
      ARG_SHOW_ID to showTraktId.id,
      ARG_MOVIE_ID to movieTraktId.id,
      ARG_FAMILY to family,
      ARG_TYPE to type,
      ARG_PICK_MODE to true
    )
    navigateTo(R.id.actionCustomImagesDialogToArtGallery, bundle)
  }

  @SuppressLint("SetTextI18n")
  private fun render(uiState: CustomImagesUiState) {

    fun loadImage(url: String, imageView: ImageView, progressView: View, deleteView: View) {
      progressView.visible()
      deleteView.gone()
      Glide.with(requireContext())
        .load(url)
        .transform(CenterCrop(), RoundedCorners(cornerRadius))
        .withSuccessListener {
          progressView.gone()
          deleteView.visible()
        }
        .withFailListener {
          progressView.gone()
          deleteView.gone()
        }
        .into(imageView)
    }

    uiState.run {
      posterImage?.let {
        if (it.status == ImageStatus.UNAVAILABLE) {
          Glide.with(requireContext()).clear(viewCustomImagesPosterImage)
          viewCustomImagesPosterAddButton.visible()
          viewCustomImagesPosterDelete.gone()
          return@let
        }
        viewCustomImagesPosterAddButton.gone()
        loadImage(
          it.fullFileUrl,
          viewCustomImagesPosterImage,
          viewCustomImagesPosterProgress,
          viewCustomImagesPosterDelete
        )
      }
      fanartImage?.let {
        if (it.status == ImageStatus.UNAVAILABLE) {
          Glide.with(requireContext()).clear(viewCustomImagesFanartImage)
          viewCustomImagesFanartAddButton.visible()
          viewCustomImagesFanartDelete.gone()
          setFragmentResult(REQUEST_CUSTOM_IMAGE, bundleOf(ARG_CUSTOM_IMAGE_CLEARED to true))
          return@let
        }
        viewCustomImagesFanartAddButton.gone()
        loadImage(
          it.fullFileUrl,
          viewCustomImagesFanartImage,
          viewCustomImagesFanartProgress,
          viewCustomImagesFanartDelete
        )
      }
    }
  }
}
