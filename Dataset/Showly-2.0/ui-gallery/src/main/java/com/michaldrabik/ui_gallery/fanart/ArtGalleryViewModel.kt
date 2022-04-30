package com.michaldrabik.ui_gallery.fanart

import androidx.lifecycle.viewModelScope
import com.michaldrabik.ui_base.BaseViewModel
import com.michaldrabik.ui_base.utilities.ActionEvent
import com.michaldrabik.ui_gallery.fanart.cases.ArtLoadImagesCase
import com.michaldrabik.ui_model.IdTrakt
import com.michaldrabik.ui_model.Ids
import com.michaldrabik.ui_model.Image
import com.michaldrabik.ui_model.ImageFamily
import com.michaldrabik.ui_model.ImageSource.CUSTOM
import com.michaldrabik.ui_model.ImageStatus
import com.michaldrabik.ui_model.ImageType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArtGalleryViewModel @Inject constructor(
  private val imagesCase: ArtLoadImagesCase,
) : BaseViewModel() {

  private val imagesState = MutableStateFlow<List<Image>?>(null)
  private val typeState = MutableStateFlow(ImageType.FANART)
  private val pickedImageState = MutableStateFlow<ActionEvent<Image>?>(null)
  private val loadingState = MutableStateFlow(false)

  val uiState = combine(
    imagesState,
    typeState,
    pickedImageState,
    loadingState
  ) { s1, s2, s3, s4 ->
    ArtGalleryUiState(
      images = s1,
      type = s2,
      pickedImage = s3,
      isLoading = s4
    )
  }.stateIn(
    scope = viewModelScope,
    started = SharingStarted.WhileSubscribed(SUBSCRIBE_STOP_TIMEOUT),
    initialValue = ArtGalleryUiState()
  )

  fun loadImages(id: IdTrakt, family: ImageFamily, type: ImageType) {
    viewModelScope.launch {
      val image = imagesCase.loadInitialImage(id, family, type)
      if (image.status == ImageStatus.AVAILABLE) {
        imagesState.value = listOf(image)
        typeState.value = type
      }
      try {
        loadingState.value = true
        val allImages = imagesCase.loadAllImages(id, family, type, image)
        imagesState.value = allImages
        typeState.value = type
        loadingState.value = false
      } catch (t: Throwable) {
        loadingState.value = false
      }
    }
  }

  fun saveCustomImage(id: IdTrakt, image: Image, family: ImageFamily, type: ImageType) {
    viewModelScope.launch {
      imagesCase.saveCustomImage(id, image, family, type)
      pickedImageState.value = ActionEvent(image)
    }
  }

  fun addImageFromUrl(imageUrl: String, family: ImageFamily, type: ImageType) {
    if (imageUrl.isBlank()) return

    val currentImages = uiState.value.images?.toMutableList() ?: mutableListOf()
    val image = Image.createAvailable(Ids.EMPTY, type, family, imageUrl.trim(), CUSTOM)
    currentImages.add(0, image)

    imagesState.value = currentImages
  }
}
