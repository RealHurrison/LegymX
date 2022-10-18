package com.fssmsl.legymx.api.data.activity

import com.google.gson.annotations.SerializedName

data class ActivitySignUpResponse (
    @SerializedName("success") val success : Boolean,
    @SerializedName("reason") val reason : String
)