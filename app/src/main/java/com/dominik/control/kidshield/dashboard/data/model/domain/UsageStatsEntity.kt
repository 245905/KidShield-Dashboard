package com.dominik.control.kidshield.dashboard.data.model.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dominik.control.kidshield.dashboard.data.model.domain.UploadStatusType
import java.util.Date

@Entity(tableName = "usage_stats")
data class UsageStatsEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: Date,
    val packageName: String,

    val lastTimeUsed: Long,

    val totalTimeInForeground: Long, // main data
    val totalTimeVisible: Long,

    val status: UploadStatusType
)
