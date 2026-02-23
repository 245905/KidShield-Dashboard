package com.dominik.control.kidshield.dashboard.data.model.dto

import com.dominik.control.kidshield.dashboard.data.model.domain.PointEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.UploadStatusType


data class PointDto(
    val lat: Double,
    val lon: Double,
    val speed: Float,
    val fixTime: Long,
    val receivedTime: Long
)

fun PointDto.toEntity(): PointEntity = PointEntity(
    lat = lat,
    lon = lon,
    speed = speed,
    fixTime = fixTime,
    receivedTime = receivedTime,
    status = UploadStatusType.UPLOADED,
)

fun PointEntity.toDto(): PointDto = PointDto(
    lat = lat,
    lon = lon,
    speed = speed,
    fixTime = fixTime,
    receivedTime = receivedTime
)
