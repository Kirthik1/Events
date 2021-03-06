package com.skct.events

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val context: Context, private val mList: List<EventData>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = mList[position]

        // sets the image to the imageview from our itemHolder class
//            holder.imageView.setImageResource(data.image)

        // sets the text to the textview from our itemHolder class
        holder.textView1.text = data.name
        holder.textView2.text = data.eventDate
        holder.textView3.text = data.eventTime


        holder.cardMain.setOnClickListener {
            val intent = Intent(context, EventDetails::class.java)
            intent.putExtra("data", data)
            context.startActivity(intent)
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val textView1: TextView = itemView.findViewById(R.id.item_name)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
        val textView3: TextView = itemView.findViewById(R.id.textView11)
        val cardMain = itemView.findViewById<CardView>(R.id.crdMain)
    }
    
}