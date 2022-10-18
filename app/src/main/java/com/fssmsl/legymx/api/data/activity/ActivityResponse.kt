package com.fssmsl.legymx.api.data.activity

import com.google.gson.annotations.SerializedName

data class ActivityResponse(
    val pageNum : Long,
    val pageSize : Long,
    val total : Long,
    val items : List<ActivityItem>
)
