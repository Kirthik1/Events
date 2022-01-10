package com.skct.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import com.skct.events.R.id.action_firstFragment_to_secondFragment


class FirstFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        val fragAButton: Button = view.findViewById(R.id.fragButton)

        fragAButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        val contactButton: Button = view.findViewById(R.id.contact_button)

        contactButton.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)

        }

        return view
    }









}

