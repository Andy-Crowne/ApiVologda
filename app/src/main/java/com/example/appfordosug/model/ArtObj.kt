package com.example.appfordosug.model

import com.google.gson.annotations.SerializedName

data class ArtObj (
    @SerializedName("﻿№ п.п.") val number : String,
    @SerializedName("Наименование объекта") val name : String,
    @SerializedName("Адрес объекта в соответствии  актом органа государственной власти о постановке под госохрану") val addressOf : String,
    @SerializedName("Адрес объекта уточнённый") val adressCurrent : String,
    @SerializedName("Документ о   постановке под   государственную охрану") val document : String,
    @SerializedName("Широта") val shirota : String,
    @SerializedName("Долгота") val dolgota : String,
    @SerializedName("Вид объекта") val vidObj : String,
    @SerializedName("Координата границы территории   МСК 35 X") val coordinX : String,
    @SerializedName("Координата границы территории МСК 35 Y") val coordinY : String
)