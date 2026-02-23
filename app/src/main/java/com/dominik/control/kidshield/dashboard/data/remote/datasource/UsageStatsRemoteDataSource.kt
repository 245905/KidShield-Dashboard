package com.dominik.control.kidshield.dashboard.data.remote.datasource

import com.dominik.control.kidshield.dashboard.data.model.domain.UsageStatsEntity
import com.dominik.control.kidshield.dashboard.data.model.dto.toDto
import com.dominik.control.kidshield.dashboard.data.remote.api.UsageStatsApi
import jakarta.inject.Inject

class UsageStatsRemoteDataSource @Inject constructor(private val api: UsageStatsApi) {

    suspend fun uploadData(data: List<UsageStatsEntity>){
        val req = data.map { it.toDto() }
        api.uploadData(req)
    }

}
