package com.skct.events

import android.media.metrics.Event
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonReader
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
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

    fun validate(): Boolean{
        TODO("return true if validation succeed")
        val editTxt = findViewById<EditText>(R.id.event_name_input)
        val txt = editTxt.text

    }

//    fun pushToFirestore(data: EventData): Boolean{
//
//        var db = Firebase.firestore
//        db.collection("events")
//            .document("stROnlu7XlPHkab1uYgC")
//            .set()
//            .addSnapshotListener { value, error ->
//                return@addSnapshotListener
//            }
//            return false
//    }
}