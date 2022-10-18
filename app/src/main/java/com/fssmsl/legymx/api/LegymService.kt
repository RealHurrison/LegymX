package com.fssmsl.legymx.api

import com.fssmsl.legymx.api.data.ResBase
import com.fssmsl.legymx.api.data.activity.*
import com.fssmsl.legymx.api.data.course.CourseSignInRequest
import com.fssmsl.legymx.api.data.login.LoginRequest
import com.fssmsl.legymx.api.data.login.LoginResponse
import com.fssmsl.legymx.api.data.run.RunningLimitRequest
import com.fssmsl.legymx.api.data.run.RunningLimitResponse
import com.fssmsl.legymx.api.data.school.SchoolListResponse
import com.fssmsl.legymx.api.data.semster.SemesterResponse
import com.fssmsl.legymx.api.data.version.LastVersionResponse
import retrofit2.Call
import retrofit2.http.*

data class User (
    var id:Int,
    var name:String
    )

interface LegymService {

    @POST("authorization/user/manage/login")
    fun login(@Body loginRequest: LoginRequest): Call<ResBase<LoginResponse>>

    @GET("authorization/mobileApp/getLastVersion")
    fun getLastVersion(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Query("platform") platform: Int = 1
    ): Call<ResBase<LastVersionResponse>>

    @GET("education/semester/getCurrent")
    fun getCurrentSemester(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
    ): Call<ResBase<SemesterResponse>>

    @GET("education/course/today")
    fun getTodayActivity(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
    ): Call<ResBase<List<ActivityTodayResponse>>>

    @POST("running/app/getRunningLimit")
    fun getRunningLimit(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body runningLimitRequest: RunningLimitRequest
    ): Call<ResBase<RunningLimitResponse>>

//    @POST("running/app/getTotalRunning")

    @POST("education/app/activity/getActivityList")
    fun getActivityList(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body activityRequest: ActivityRequest
    ): Call<ResBase<ActivityResponse>>

    @POST("education/campus/queryAll")
    fun getSchoolList(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String
    ): Call<ResBase<SchoolListResponse>>

    @GET("education/app/activity/checkConflict")
    fun checkActivityConflict(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Query("activityId") activityId:String
    ): Call<ResBase<Boolean>>

    @POST("education/app/activity/signUp")
    fun signUp(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body activitySignUpRequest: ActivitySignUpRequest
    ): Call<ResBase<ActivitySignUpResponse>>

    @POST("education/activity/simple/attainability/get")
    fun getActivityGpsInfo(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body activityGpsInfoRequest: ActivityGpsInfoRequest
    ): Call<ResBase<ActivityGpsInfoResponse>>

    @PUT("education/activity/app/attainability/sign")
    fun signIn(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body activitySignInRequest: ActivitySignInRequest
    ): Call<ResBase<Any>>

    @GET("education/app/activity/checkSignInterval")
    fun checkActivitySignInterval(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Query("activityId") activityId:String
    ): Call<ResBase<ActivitySignIntervalResponse>>

    @Deprecated("NOT VERIFIED")
    @PUT("education/activity/app/attainability/sign")
    fun signIn(
        @Header("Authorization") authorization: String,
        @Header("Organization") organization: String,
        @Body courseSignInRequest: CourseSignInRequest
    ): Call<ResBase<Any>>
}