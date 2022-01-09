package com.skct.events

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<EventData>()

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(this, data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        val db = Firebase.firestore
        db.collection("events")
            .document("stROnlu7XlPHkab1uYgC")
            .addSnapshotListener { value, error ->
                data.clear()
                value?.data?.values?.forEach { _event ->
                    data.add(Gson().fromJson(_event.toString(), EventData::class.java))
                    adapter.notifyDataSetChanged()
                }

            }



        findViewById<FloatingActionButton>(R.id.fab_add).setOnClickListener()
        {
            val intent = Intent(this, AddEventActivity::class.java)
            startActivity(intent)
        }

        findViewById<FloatingActionButton>(R.id.notesfab).setOnClickListener()
        {
            val intent = Intent(this, NoteMainActivity::class.java)
            startActivity(intent)
        }

    }
}