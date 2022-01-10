package com.skct.events

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


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

        val homeb: Button = view.findViewById(R.id.homebutton)
        homeb.setOnClickListener{
            moveToNewActivity()

        }

        return view
    }

    private fun moveToNewActivity() {
        val i = Intent(activity, MainActivity::class.java)
        startActivity(i)
        (activity as Activity?)!!.overridePendingTransition(0, 0)
    }









}

