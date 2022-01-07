package com.skct.events

import android.os.Parcelable
import android.text.Editable
import java.sql.Time
import java.util.*

data class EventData(
        val name: String,
        val description: String,
        val venueData: String,
        val eventDate: Date,
        val eventTime: Time,
        val coordinatorsName: String
)
