package com.dominik.control.kidshield.dashboard.data.model.dto

import com.dominik.control.kidshield.dashboard.data.model.domain.StepCountEntity
import com.dominik.control.kidshield.dashboard.data.model.domain.UploadStatusType

data class StepCountDto(
    val steps: Long,
    val timestamp: Long,
)

fun StepCountDto.toEntity(): StepCountEntity = StepCountEntity(
    timestamp = timestamp,
    steps = steps,
    status = UploadStatusType.UPLOADED,
)

fun StepCountEntity.toDto(): StepCountDto = StepCountDto(
    timestamp = timestamp,
    steps = steps
)
