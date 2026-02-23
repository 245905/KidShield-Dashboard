package com.dominik.control.kidshield.dashboard.data.remote.datasource

import com.dominik.control.kidshield.dashboard.data.model.domain.SigMotionEntity
import com.dominik.control.kidshield.dashboard.data.model.dto.toDto
import com.dominik.control.kidshield.dashboard.data.model.dto.toEntity
import com.dominik.control.kidshield.dashboard.data.remote.api.SigMotionApi
import jakarta.inject.Inject

class SigMotionRemoteDataSource @Inject constructor(private val api: SigMotionApi) {

    suspend fun uploadData(data: List<SigMotionEntity>){
        val req = data.map { it.toDto() }
        api.uploadData(req)
    }

    suspend fun downloadData(): List<SigMotionEntity>{
        val req = api.downloadData()
        return req.map { it.toEntity() }
    }
}
