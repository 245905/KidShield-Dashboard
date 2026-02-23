package com.dominik.control.kidshield.dashboard.data.remote.datasource

import com.dominik.control.kidshield.dashboard.data.model.domain.AppInfoEntity
import com.dominik.control.kidshield.dashboard.data.model.dto.toDto
import com.dominik.control.kidshield.dashboard.data.model.dto.toEntity
import com.dominik.control.kidshield.dashboard.data.remote.api.AppInfoApi
import jakarta.inject.Inject

class AppInfoRemoteDataSource @Inject constructor(private val api: AppInfoApi) {

    suspend fun uploadData(data: List<AppInfoEntity>){
        val req = data.map { it.toDto() }
        api.uploadData(req)
    }

    suspend fun downloadData(): List<AppInfoEntity>{
        val req = api.downloadData()
        return req.map { it.toEntity() }
    }

}
