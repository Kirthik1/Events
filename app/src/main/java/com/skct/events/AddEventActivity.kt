package com.skct.events

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.*
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import java.text.DateFormat
import java.util.*

class AddEventActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {
    // Date and Time Picker Variables
    lateinit var textView: TextView
    lateinit var button: Button
    var day = 0
    var month: Int = 0
    var year: Int = 0
    var hour: Int = 0
    var minute: Int = 0
    var myDay = 0
    var myMonth: Int = 0
    var myYear: Int = 0
    var myHour: Int = 0
    var myMinute: Int = 0

    // Event Data Variables

    private lateinit var eventName: EditText
    private lateinit var eventDescription: EditText
    private lateinit var eventVenue: EditText
    private lateinit var eventCoordinators: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_event_activity)

        //initializing event details
        eventName = findViewById(R.id.event_name_input)
        eventDescription = findViewById(R.id.event_description_edtxt)
        eventVenue = findViewById(R.id.event_venue_input)
        eventCoordinators = findViewById(R.id.event_coordinator)


        //initialization of date picker variable

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.btnPick)
        button.setOnClickListener {
            val calendar: Calendar = Calendar.getInstance()
            day = calendar.get(Calendar.DAY_OF_MONTH)
            month = calendar.get(Calendar.MONTH)
            year = calendar.get(Calendar.YEAR)
            val datePickerDialog =
                DatePickerDialog(this@AddEventActivity, this@AddEventActivity, year, month, day)
            datePickerDialog.show()
        }


        // Calling functions basic functions
        /*var validateVariable = validate()
        if(validateVariable){
            pushToFirestore(EventData(eventName.text,eventDescription.text,eventCoordinators.text,))
        }*/
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        myDay = day
        myYear = year
        myMonth = month
        val calendar: Calendar = Calendar.getInstance()
        hour = calendar.get(Calendar.HOUR)
        minute = calendar.get(Calendar.MINUTE)
        val timePickerDialog =
            TimePickerDialog(this@AddEventActivity, this@AddEventActivity, hour, minute, true)
        timePickerDialog.show()
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        myHour = hourOfDay
        myMinute = minute
        textView.text = "Year: " + myYear + "\n" + "Month: " + myMonth + "\n" + "Day: " + myDay + "\n" + "Hour: " + myHour + "\n" + "Minute: " + myMinute
    }


    fun validate(): Boolean {
        if (eventName.text.toString().isEmpty()) {
            return false
        }
        if (eventDescription.text.toString().isEmpty()) {
            return false
        }
        if (eventVenue.text.toString().isEmpty()) {
            return false
        }
        if (eventCoordinators.text.toString().isEmpty()) {
            return false
        }
        //change
        return true
    }






    fun pushToFirestore(data: EventData): Boolean {
        val db = Firebase.firestore
        db.collection("events")
            .document("stROnlu7XlPHkab1uYgC")
            .set(Gson().toJson(data))
            .addOnSuccessListener {

            }
        return false
    }




}








