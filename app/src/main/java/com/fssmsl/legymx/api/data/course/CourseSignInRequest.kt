package com.fssmsl.legymx.api.data.course

data class CourseSignInRequest (
    var attainabilityType: Long,
    var courseId: String,
    var weekNumber: Long,
    var code: Any,
    var time: Long,
    var signDigital: String,
    var signType: Long
)