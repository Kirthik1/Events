package com.skct.events

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.sql.Time
import java.util.*

@Parcelize
data class EventData(
    val name: String,
    val description: String,
    val venueData: String,
    val eventDate: Date,
    val eventTime: Time,
    val coordinatorsName: String
) : Parcelable
