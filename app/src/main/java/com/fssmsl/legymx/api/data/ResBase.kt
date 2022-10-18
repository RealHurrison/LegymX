package com.fssmsl.legymx.api.data

import com.google.gson.annotations.SerializedName

data class ResBase<T>(
    @SerializedName("code") val code : Int,
    @SerializedName("message") val message : String,
    @SerializedName("data") val data : T?
)
