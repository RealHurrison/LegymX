package com.fssmsl.legymx.api.data.activity

data class ActivityGpsInfoResponse(
    val id : String,
    val activityId : String,
    val attainabilityDate : List<Long>,
    val weekIndex : String,
    val attainabilityType : Long,
    val attainabilitySwitch : Long,
    val times : Long,
    val locationLongitude : Double,
    val locationLatitude : Double,
    val radius : Long
)
