package com.dominik.control.kidshield.dashboard.data.remote.api

import com.dominik.control.kidshield.dashboard.data.model.dto.HourlyStatsDto
import com.dominik.control.kidshield.dashboard.data.model.dto.MessageResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface HourlyStatsApi {

    @POST("api/v1/hourlyStats")
    suspend fun uploadData(@Body data: List<HourlyStatsDto>): MessageResponse

}
