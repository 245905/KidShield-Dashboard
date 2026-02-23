package com.dominik.control.kidshield.dashboard.data.remote.api

import com.dominik.control.kidshield.dashboard.data.model.dto.AppInfoDiffDto
import retrofit2.http.GET

interface AppInfoDiffApi {

    @GET("api/v1/appInfoDiff")
    suspend fun downloadData(): List<AppInfoDiffDto>;

}
