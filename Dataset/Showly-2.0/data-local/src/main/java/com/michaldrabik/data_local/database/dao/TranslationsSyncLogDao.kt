package com.michaldrabik.data_local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.michaldrabik.data_local.database.model.TranslationsSyncLog

@Dao
interface TranslationsSyncLogDao {

  @Query("SELECT * from sync_translations_log")
  suspend fun getAll(): List<TranslationsSyncLog>

  @Query("SELECT * from sync_translations_log WHERE id_show_trakt == :idTrakt")
  suspend fun getById(idTrakt: Long): TranslationsSyncLog?

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun upsert(log: TranslationsSyncLog)

  @Query("DELETE FROM sync_translations_log")
  suspend fun deleteAll()
}
