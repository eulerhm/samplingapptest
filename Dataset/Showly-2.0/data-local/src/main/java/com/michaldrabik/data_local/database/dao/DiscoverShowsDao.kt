package com.michaldrabik.data_local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.michaldrabik.data_local.database.model.DiscoverShow

@Dao
interface DiscoverShowsDao {

  @Query("SELECT * FROM shows_discover ORDER BY id")
  suspend fun getAll(): List<DiscoverShow>

  @Query("SELECT * from shows_discover ORDER BY created_at DESC LIMIT 1")
  suspend fun getMostRecent(): DiscoverShow?

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun upsert(shows: List<DiscoverShow>)

  @Query("DELETE FROM shows_discover")
  suspend fun deleteAll()

  @Transaction
  suspend fun replace(shows: List<DiscoverShow>) {
    deleteAll()
    upsert(shows)
  }
}
