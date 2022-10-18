package com.fssmsl.legymx.api.data.school

data class SchoolListResponse (
    val name : String,
    val organizationId : String,
    val latitude : Double,
    val longitude : Double,
    val address : String,
    val id : String
)