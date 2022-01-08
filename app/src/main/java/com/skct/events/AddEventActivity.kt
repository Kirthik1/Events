package com.skct.events

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.*
import java.text.DateFormat
import java.util.*

class AddEventActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
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
                    DatePickerDialog(this@AddEventActivity, this@AddEventActivity, year, month,day)
            datePickerDialog.show()
        }
    }
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        myDay = day
        myYear = year
        myMonth = month
        val calendar: Calendar = Calendar.getInstance()
        hour = calendar.get(Calendar.HOUR)
        minute = calendar.get(Calendar.MINUTE)
        val timePickerDialog = TimePickerDialog(this@AddEventActivity, this@AddEventActivity, hour, minute,true)
        timePickerDialog.show()
    }
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        myHour = hourOfDay
        myMinute = minute
        textView.text = "Year: " + myYear + "\n" + "Month: " + myMonth + "\n" + "Day: " + myDay + "\n" + "Hour: " + myHour + "\n" + "Minute: " + myMinute
    }


    /*    fun validate(): Boolean{
        TODO("return true if validation succeed")
        val event_name = findViewById<EditText>(R.id.event_name_input)
        val txt = event_name.text
        val text:String = txt.toString()

        val dataclss = EventData(text)


    }*/

    /*fun pushToFirestore(data: EventData): Boolean{
    TODO("kanna !!!!! please do this kanna ....
     1] Get the data from @addeventdata this data to firestore, and create a card in main activity(recycler view) when he clicks save
     2] Return this data from firestore
     4] displaying the detials in card @Main
     5] when we click the card display the particular details of the card @EventDetails
     6]   )

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








