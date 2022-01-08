package com.skct.events

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.sql.Time
import java.util.*

@Parcelize
data class EventData(
    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("venue_data")
    val venueData: String,

    @SerializedName("coordinator_name")
    val coordinatorsName: String,

    @SerializedName("event_date")
    val eventDate: String,

    @SerializedName("event_time")
    val eventTime: String,

    @SerializedName("event_field_id")
    val eventFieldId: String


) : Parcelable
