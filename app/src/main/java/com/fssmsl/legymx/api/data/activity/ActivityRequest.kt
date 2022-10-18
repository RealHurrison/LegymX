package com.fssmsl.legymx.api.data.activity

import com.google.gson.annotations.SerializedName

//0 未开始  1 报名中  2 报名结束  4 进行中
enum class ActivityState {
    @SerializedName("")
    NO_LIMIT,
    @SerializedName("0")
    NOT_START,
    @SerializedName("1")
    SIGN_UP,
    @SerializedName("2")
    SIGN_UP_END,
    @SerializedName("4")
    DOING
}

data class ActivityRequest(
    var name : String,
    var campus : String,
    var page : Long,
    var size : Long,
    var state : String,
    var topicId : String,
    var week : String,
)
