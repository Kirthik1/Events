package com.skct.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class thirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third, container, false)
        val buttonback =view.findViewById<Button>(R.id.backbuttonfrag3)
        buttonback.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        return view
    }


}