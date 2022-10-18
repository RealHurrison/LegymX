package com.fssmsl.legymx.api.data.activity

import com.fssmsl.legymx.api.LegymSigner

data class ActivitySignInRequest(
    var pageType : String = "activity",
    var activityId : String,
    var times : Long,
    var userId : String,
    var activityType : Long,
    var attainabilityType : Long,
    var signDigital : String? = null
){
    fun sign(): ActivitySignInRequest {
        signDigital = LegymSigner.signDigital(activityId + attainabilityType + userId)
        return this
    }
}
