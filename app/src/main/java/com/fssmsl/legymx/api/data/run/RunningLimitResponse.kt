package com.fssmsl.legymx.api.data.run

data class RunningOpenTime(
     val dayStartTime : Long,
     val dayEndTime : Long
)

data class RunningWeekOpenTime(
    val dayStartTime : Long,
    val dayEndTime : Long,
    val week : String // 1,2,3,4,5,6,7
)

data class RunningTimeLimit(
    val startTime : Long,
    val endTime : Long,
    val openTimes : List<RunningOpenTime>,
    val weekOpenTimes : List<RunningWeekOpenTime>
)

data class RunningLimitResponse(
    val hasRule : Boolean,
    val limitationsGoalsSexInfoId : String,
    val scoringType : Long,
    val totalWeekMileage : Double,
    val totalWeekPart : Long,
    val totalDayMileage : Double,
    val totalDayPart : Long,
    val averageSpeedStart : Long,
    val averageSpeedEnd : Long,
    val averageCadenceStart : Long,
    val averageCadenceEnd : Long,
    val effectiveMileageStart : Double,
    val effectiveMileageEnd : Double,
    val dailyMileage : Double,
    val weeklyMileage : Long,
    val semesterMileage : Long,
    val effectiveParagraphMileage : Any,
    val effectiveParagraphStart : Any,
    val effectiveParagraphEnd : Any,
    val dailyParagraph : Any,
    val weeklyParagraph : Any,
    val semesterParagraph : Any,
    val freePattern : Long,
    val scopePattern : Long,
    val scopePercentage : Long,
    val fixedPoLongPattern : Long,
    val fixedPoLongPercentage : Long,
    val fixedPoLongOrder : Long,
    val fixedPoLongNumber : Long,
    val runningTimeLimit : RunningTimeLimit,
    val enableStatus : String,
    val notice : String,
    val currentTimeStamp : Long,
    val patternId : String,
    val faceRunningStatus : Boolean,
    val routes : Any
)
