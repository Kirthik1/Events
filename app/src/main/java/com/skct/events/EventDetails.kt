package com.skct.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class EventDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_details)
        val eventData: EventData? = intent.extras?.getParcelable("data")

        val tv1: TextView = findViewById(R.id.textView5)
        val tv2: TextView = findViewById(R.id.textView7)
        val tv3: TextView = findViewById(R.id.textView13)
        val tv4: TextView = findViewById(R.id.textView14)
        val tv5: TextView = findViewById(R.id.textView12)
        val tv6: TextView = findViewById(R.id.textView16)

        if (eventData != null) {
            tv1.text = eventData.name
            tv2.text = eventData.description
            tv3.text = eventData.eventDate
            tv4.text = eventData.eventTime
            tv5.text = eventData.coordinatorsName
            tv6.text = eventData.venueData

        }

        val eventcompletebutton = findViewById<Button>(R.id.completed_button)
        eventcompletebutton.setOnClickListener(){

        }
    }
}