package com.skct.events

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
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
    private lateinit var eventDate: String
    private lateinit var eventTime: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_event_activity)

        //initializing event details
        eventName = findViewById(R.id.event_name_input)
        eventDescription = findViewById(R.id.event_description_edtxt)
        eventVenue = findViewById(R.id.event_venue_input)
        eventCoordinators = findViewById(R.id.event_coordinator)

        // initialization of add event button
        var addButton = findViewById<Button>(R.id.addEventButton)


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


        // Calling functions basic functions on the click of ADD Button
        addButton.setOnClickListener(){
        var validateVariable = validate()
        if (validateVariable) {
            pushToFirestore(EventData(eventName.text.toString(), eventDescription.text.toString(), eventVenue.text.toString(), eventCoordinators.text.toString(), eventDate, eventTime))
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            val message: String = "Please enter all the details"
            var toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
            toast.show()

        }
    }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        myDay = day
        myYear = year
        myMonth = month+1
        val calendar: Calendar = Calendar.getInstance()
        hour = calendar.get(Calendar.HOUR)
        minute = calendar.get(Calendar.MINUTE)
        val timePickerDialog =
            TimePickerDialog(this@AddEventActivity, this@AddEventActivity, hour, minute, true)
        timePickerDialog.show()
    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        myHour = hourOfDay
        myMinute = minute
        textView.text =
            "Year: $myYear\nMonth: $myMonth\nDay: $myDay\nHour: $myHour\nMinute: $myMinute"
        eventDate = "$myDay/$myMonth/$myYear"
        eventTime = "$myHour:$myMinute"
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
        return  db.collection("events")
            .document("stROnlu7XlPHkab1uYgC")
            .set(mapOf<String, String>("000" to Gson().toJson(data)))
            .isSuccessful
    }

}








