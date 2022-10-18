package com.fssmsl.legymx.api.data.login

import com.fssmsl.legymx.api.LegymSigner

data class LoginRequest(
    var entrance: Int = 1,
    var password: String,
    var userName: String,
    var signDigital: String? = null
){
    fun sign(): LoginRequest{
        signDigital = LegymSigner.signDigital(userName + password + entrance)
        return this
    }
}
