package com.michaldrabik.ui_statistics_movies.cases

import com.michaldrabik.repository.RatingsRepository
import com.michaldrabik.repository.UserTraktManager
import com.michaldrabik.repository.movies.MoviesRepository
import com.michaldrabik.ui_base.images.MovieImagesProvider
import com.michaldrabik.ui_model.ImageType
import com.michaldrabik.ui_statistics_movies.views.ratings.recycler.StatisticsMoviesRatingItem
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class StatisticsMoviesLoadRatingsCase @Inject constructor(
  private val userTraktManager: UserTraktManager,
  private val moviesRepository: MoviesRepository,
  private val ratingsRepository: RatingsRepository,
  private val imagesProvider: MovieImagesProvider
) {

  companion object {
    private const val LIMIT = 25
  }

  suspend fun loadRatings(): List<StatisticsMoviesRatingItem> {
    if (!userTraktManager.isAuthorized()) {
      return emptyList()
    }

    val token = userTraktManager.checkAuthorization()
    val ratings = ratingsRepository.movies.loadMoviesRatings(token.token)

    val ratingsIds = ratings.map { it.idTrakt }
    val myMovies = moviesRepository.myMovies.loadAll(ratingsIds).distinctBy { it.traktId }

    return ratings
      .filter { rating -> myMovies.any { it.traktId == rating.idTrakt.id } }
      .take(LIMIT)
      .map { rating ->
        val movie = myMovies.first { it.traktId == rating.idTrakt.id }
        StatisticsMoviesRatingItem(
          isLoading = false,
          movie = movie,
          image = imagesProvider.findCachedImage(movie, ImageType.POSTER),
          rating = rating
        )
      }.sortedByDescending { it.rating.ratedAt }
  }
}
