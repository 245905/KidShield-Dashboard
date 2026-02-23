package com.dominik.control.kidshield.dashboard.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.dominik.control.kidshield.dashboard.data.local.dao.AppInfoDao
import com.dominik.control.kidshield.dashboard.data.local.dao.AppInfoDiffDao
import com.dominik.control.kidshield.dashboard.data.local.dao.HourlyStatsDao
import com.dominik.control.kidshield.dashboard.data.local.dao.PointDao
import com.dominik.control.kidshield.dashboard.data.local.dao.SigMotionDao
import com.dominik.control.kidshield.dashboard.data.local.dao.StepCounterDao
import com.dominik.control.kidshield.dashboard.data.local.dao.UploadedStatsDao
import com.dominik.control.kidshield.dashboard.data.local.dao.UsageStatsDao
import com.dominik.control.kidshield.dashboard.data.model.domain.AppInfoDiffEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.AppInfoEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.HourlyStatsEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.PointEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.SigMotionEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.StepCountEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.UploadedStatsEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.UsageStatsEntity
import com.dominik.control.kidshield.dashboard.utils.Converters

@Database(entities = [AppInfoEntity::class, UsageStatsEntity::class, HourlyStatsEntity::class, AppInfoDiffEntity::class, UploadedStatsEntity::class, PointEntity::class, StepCountEntity::class, SigMotionEntity::class], version = 6)
@TypeConverters(Converters::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun appInfoDao(): AppInfoDao
    abstract fun usageStatsDao(): UsageStatsDao
    abstract fun hourlyStatsDao(): HourlyStatsDao
    abstract fun appInfoDiffDao(): AppInfoDiffDao
    abstract fun uploadedStatsDao(): UploadedStatsDao
    abstract fun pointDao(): PointDao
    abstract fun stepCount(): StepCounterDao
    abstract fun sigMotion(): SigMotionDao

}