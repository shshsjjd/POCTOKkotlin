package com.coolgirl.poctokkotlin.data.dto

data class Plant(
    var plantname: String?,
    var plantdescription : String?,
    var plantid: Int?,
    var plantimage: String?,
    var userid: Int?,
    var user: UserLoginDataResponse?,
    var wateringSchedule: WateringSchedule?,
    var wateringHistories: List<WateringHistory?>?,
)
