package com.fssmsl.legymx.api.data.semster

data class SemesterResponse(
    val organizationId : String,
    val startDate : Long,
    val endDate : Long,
    val yearRange : String,
    val current : String,
    val index : Long,
    val weekIndex : Long,
    val id : String
)
