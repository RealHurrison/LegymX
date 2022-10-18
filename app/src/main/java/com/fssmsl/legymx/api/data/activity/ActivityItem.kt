package com.fssmsl.legymx.api.data.activity

import com.google.gson.annotations.SerializedName

data class ActivityItem(
    @SerializedName("id") val id : String,
    @SerializedName("name") val name : String,
    @SerializedName("state") val state : Long,
    @SerializedName("stateName") val stateName : String,
    @SerializedName("startRegisterTime") val startRegisterTime : Long,
    @SerializedName("endRegisterTime") val endRegisterTime : Long,
    @SerializedName("startTime") val startTime : Long,
    @SerializedName("endTime") val endTime : Long,
    @SerializedName("address") val address : String,
    @SerializedName("bgUrl") val bgUrl : String,
    @SerializedName("limitPeopleNumber") val limitPeopleNumber : Long,
    @SerializedName("registerPeople") val registerPeople : Long,
    @SerializedName("departureStartTime") val departureStartTime : String,
    @SerializedName("isRegister") val isRegister : Boolean,
    @SerializedName("isSign") val isSign : String,
    @SerializedName("signType") val signType : String,
    @SerializedName("signTime") val signTime : String,
    @SerializedName("performSignType") val performSignType : String,
    @SerializedName("openSignTimes") val openSignTimes : String,
    @SerializedName("performTime") val performTime : String
)
