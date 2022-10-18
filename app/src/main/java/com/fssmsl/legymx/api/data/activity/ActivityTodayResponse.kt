package com.fssmsl.legymx.api.data.activity

import com.google.gson.annotations.SerializedName

data class ActivityTodayResponse(
    val projectName : String,
    val courseActivityId : String,
    val timeStart : Long,
    val timeEnd : Long,
    val weekIndex : String,
    val attainabilityType : Long,
    val attainabilitySwitch : Long,
    val times : Long,
    val locationLongitude : Double,
    val locationLatitude : Double,
    val radius : Long,
    val courseActivityType : Long,
    val signType : Long,
    val allowSureSign : String
)
