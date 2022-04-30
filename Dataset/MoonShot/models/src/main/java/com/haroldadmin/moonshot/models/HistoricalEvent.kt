package com.haroldadmin.moonshot.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class HistoricalEvent(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "event_data_utc")
    val date: Date,
    @ColumnInfo(name = "flight_number")
    val flightNumber: Int,
    @ColumnInfo(name = "details")
    val details: String,
    @Embedded
    val links: Links
)

data class Links(
    val reddit: String?,
    val article: String?,
    val wikipedia: String?
)
