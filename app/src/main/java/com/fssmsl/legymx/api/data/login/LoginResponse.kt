package com.fssmsl.legymx.api.data.login

data class LoginResponse(
    val id : String,
    val uuasId : String,
    val organizationVerified : Long,
    val identity : String,
    val organizationId : String,
    val organizationName : String,
    val schoolId : String,
    val schoolName : String,
    val organizationUserNumber : String,
    val nickName : String,
    val realName : String,
    val avatar : String,
    val gender : Int,
    val birthDay : Long,
    val height : Int,
    val weight : Int,
    val faceId : String,
    val campusId : String,
    val year : Long,
    val accountNumber : Long,
    val mobile : Long,
    val authorities : List<String>,
    val accessToken : String,
    val tokenType : String,
    val refreshToken : String,
    @Deprecated("userId is always null, use id instead")
    val userId : String,
    val semesterId : String,
    val campusName : String,
    val accessTokenExpires : Long
)
