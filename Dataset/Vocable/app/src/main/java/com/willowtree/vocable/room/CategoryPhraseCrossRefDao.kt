package com.willowtree.vocable.room

import androidx.room.*

@Dao
interface CategoryPhraseCrossRefDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryPhraseCrossRef(categoryPhraseCrossRef: CategoryPhraseCrossRef)

    @Delete
    suspend fun deleteCategoryPhraseCrossRef(categoryPhraseCrossRef: CategoryPhraseCrossRef)

    @Delete
    suspend fun deleteCategoryPhraseCrossRefs(vararg crossRefs: CategoryPhraseCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryPhraseCrossRefs(vararg crossRefs: CategoryPhraseCrossRef)

    @Query("SELECT * FROM CategoryPhraseCrossRef WHERE phrase_id IN (:phraseIds)")
    suspend fun getCategoryPhraseCrossRefsForPhraseIds(phraseIds: List<String>): List<CategoryPhraseCrossRef>

    @Query("SELECT * FROM CategoryPhraseCrossRef WHERE category_id=:categoryId")
    suspend fun getCategoryPhraseCrossRefsForCategoryId(categoryId: String): List<CategoryPhraseCrossRef>

    @Query("SELECT * FROM CategoryPhraseCrossRef WHERE category_id=:categoryId AND phrase_id=:phraseId")
    suspend fun getSpecificCategoryPhraseCrossRef(categoryId: String, phraseId: String): CategoryPhraseCrossRef?

    @Query("UPDATE CategoryPhraseCrossRef SET timestamp=:timestamp WHERE category_id=:categoryId AND phrase_id=:phraseId")
    suspend fun updateCrossRefTimestamp(categoryId: String, phraseId: String, timestamp: Long)

    @Query("DELETE FROM CategoryPhraseCrossRef WHERE category_id In (:categoryIds)")
    suspend fun deleteCategoryPhraseCrossRefsForPhraseIds(categoryIds: List<String>)
}
