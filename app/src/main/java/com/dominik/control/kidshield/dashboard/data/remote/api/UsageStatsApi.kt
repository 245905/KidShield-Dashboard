package com.dominik.control.kidshield.dashboard.data.remote.api

import com.dominik.control.kidshield.dashboard.data.model.dto.MessageResponse
import com.dominik.control.kidshield.dashboard.data.model.dto.UsageStatsDto
import retrofit2.http.Body
import retrofit2.http.POST

interface UsageStatsApi {

    @POST("api/v1/usageStats")
    suspend fun uploadData(@Body data: List<UsageStatsDto>): MessageResponse
}