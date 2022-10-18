package com.fssmsl.legymx.api.data.version

data class LastVersionResponse(
    val id : String,
    val createdDate : Long,
    val modifiedDate : Long,
    val dataStatus : Long,
    val version : Long,
    val versionLabel : String,
    val platform : Long,
    val description : String,
    val packageUrl : String,
    val storeJumpUri : String,
    val enforce : Boolean,
    val clientReleaseDate : String,
    val current : Boolean,
    val schoolId : String,
    val organizationId : String,
    val year : Long
)
