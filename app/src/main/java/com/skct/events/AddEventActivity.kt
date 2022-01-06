package com.skct.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class AddEventActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_event_activity)
        val datePicker = findViewById<DatePicker>(R.id.date_Picker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
                today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->

        }

    }

/*
    val eventName = findViewById<EditText>(R.id.event_name_input)
    val eventNameTxt = eventName.text
    val eventDes = findViewById<EditText>(R.id.event_description_edtxt)
    val eventDesTxt = eventDes.text
    val venue = findViewById<EditText>(R.id.event_venue_input)
    val venueTxt = venue.text



    val dataclss = EventData(this.eventNameTxt, this.eventDesTxt, this.venueTxt)

*/


/*    fun validate(): Boolean{
        TODO("return true if validation succeed")
        val event_name = findViewById<EditText>(R.id.event_name_input)
        val txt = event_name.text
        val text:String = txt.toString()

        val dataclss = EventData(text)


    }*/
   /*fun pushToFirestore(data: EventData): Boolean{

        var db = Firebase.firestore
        db.collection("events")
            .document("stROnlu7XlPHkab1uYgC")
            .set()
            .addSnapshotListener { value, error ->
                return@addSnapshotListener
            }
            return false
   }*/
}