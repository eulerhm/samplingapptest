package com.michaldrabik.ui_progress.main.cases

import android.content.Context
import com.michaldrabik.ui_base.episodes.EpisodesManager
import com.michaldrabik.ui_base.trakt.quicksync.QuickSyncManager
import com.michaldrabik.ui_model.EpisodeBundle
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ProgressMainEpisodesCase @Inject constructor(
  private val episodesManager: EpisodesManager,
  private val quickSyncManager: QuickSyncManager,
) {

  suspend fun setEpisodeWatched(context: Context, bundle: EpisodeBundle) {
    episodesManager.setEpisodeWatched(bundle)
    quickSyncManager.scheduleEpisodes(listOf(bundle.episode.ids.trakt.id))
  }
}
