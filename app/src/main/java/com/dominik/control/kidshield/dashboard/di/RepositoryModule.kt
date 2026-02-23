package com.dominik.control.kidshield.dashboard.di

import com.dominik.control.kidshield.dashboard.data.repository.AppInfoDiffRepository
import com.dominik.control.kidshield.dashboard.data.repository.AppInfoDiffRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.AppInfoRepository
import com.dominik.control.kidshield.dashboard.data.repository.AppInfoRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.AuthRepository
import com.dominik.control.kidshield.dashboard.data.repository.AuthRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.HourlyStatsRepository
import com.dominik.control.kidshield.dashboard.data.repository.HourlyStatsRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.RouteRepository
import com.dominik.control.kidshield.dashboard.data.repository.RouteRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.SensorInfoRepository
import com.dominik.control.kidshield.dashboard.data.repository.SensorInfoRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.SigMotionRepository
import com.dominik.control.kidshield.dashboard.data.repository.SigMotionRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.StepCountRepository
import com.dominik.control.kidshield.dashboard.data.repository.StepCountRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.TestRepository
import com.dominik.control.kidshield.dashboard.data.repository.TestRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.UploadedStatsRepository
import com.dominik.control.kidshield.dashboard.data.repository.UploadedStatsRepositoryImpl
import com.dominik.control.kidshield.dashboard.data.repository.UsageStatsRepository
import com.dominik.control.kidshield.dashboard.data.repository.UsageStatsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule{
    @Binds
    abstract fun bindAppInfoRepo(impl: AppInfoRepositoryImpl): AppInfoRepository

    @Binds
    abstract fun bindAppInfoDiffRepo(impl: AppInfoDiffRepositoryImpl): AppInfoDiffRepository

    @Binds
    abstract fun bindUsageStatsRepo(impl: UsageStatsRepositoryImpl): UsageStatsRepository

    @Binds
    abstract fun bindTestRepo(impl: TestRepositoryImpl): TestRepository

    @Binds
    abstract fun bindHourlyStatsRepo(impl: HourlyStatsRepositoryImpl): HourlyStatsRepository

    @Binds
    abstract fun bindAuthRepo(impl: AuthRepositoryImpl): AuthRepository

    @Binds
    abstract fun bindRouteRepo(impl: RouteRepositoryImpl): RouteRepository

    @Binds
    abstract fun bindUploadedStatsRepo(impl: UploadedStatsRepositoryImpl): UploadedStatsRepository

    @Binds
    abstract fun bindStepCountRepo(impl: StepCountRepositoryImpl): StepCountRepository

    @Binds
    abstract fun bindSigMotionRepo(impl: SigMotionRepositoryImpl): SigMotionRepository

    @Binds
    abstract fun bindSensorInfoRepo(impl: SensorInfoRepositoryImpl): SensorInfoRepository
}
