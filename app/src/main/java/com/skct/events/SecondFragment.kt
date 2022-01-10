package com.skct.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val backButtonFrag2 = view.findViewById<Button>(R.id.backbuttonfragment2)
        backButtonFrag2.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)

        }

        val eventdestext: TextView = view.findViewById(R.id.textView24)
        eventdestext.text = "1. Once you login, you will be present with the home screen \n\n 2.In home screen list of events will be displayed \n\n 3.You can click on any event to show the details of the event \n\n 4.You Can press event completed to remove the event after it's completion \n\n 5.Press on Plus Button on the corner to add new Event"


        val notedestext: TextView = view.findViewById(R.id.textView26)
        notedestext.text = "1.To launch Notes section press on the notes button present in corner \n\n 2.Press plus button to add a new note and add the notes and press save note to save it \n\n 3.Press on any note to display it and you edit it and click update to update your notes \n\n 4.Press on the delete icon near note to delete note"

        return view
    }


}