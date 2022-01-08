package com.skct.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EventDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_details)
        val eventData: EventData? = intent.extras?.getParcelable("data")
    }
}