package com.fssmsl.legymx.api.data.activity

data class ActivitySignIntervalResponse (
    val signIn: Boolean,
    val timeInterval: String // 3519056 / 1000. / 60
)