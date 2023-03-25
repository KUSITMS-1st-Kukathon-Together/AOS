package com.team2.together1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController

@Suppress("UNREACHABLE_CODE")
class CarefulFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_careful, container, false)
        return view

//        view.findViewById<Button>(R.id.btn1).setOnClickListener {
//            it.findNavController().navigate(R.id.action_carefulFragment2_to_recommendFragment2)
//
//        }




    }


}
