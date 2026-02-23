package com.dominik.control.kidshield.dashboard.data.remote.api

import com.dominik.control.kidshield.dashboard.data.model.dto.GenerateCodeResponse
import com.dominik.control.kidshield.dashboard.data.model.dto.PairByPinRequest
import com.dominik.control.kidshield.dashboard.data.model.dto.PairByUUIDRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface PairingApi {

    @POST("api/v1/pair/code")
    suspend fun generateCode(): GenerateCodeResponse

    @POST("api/v1/pair/qr")
    suspend fun pairByUUID(@Body request: PairByUUIDRequest)

    @POST("api/v1/pair/pin")
    suspend fun pairByPin(@Body request: PairByPinRequest)
}
