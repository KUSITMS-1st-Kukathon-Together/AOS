package com.team2.together1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

@Suppress("UNREACHABLE_CODE")
class RecommendFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recommend, container, false)

        return view

//        view.findViewById<Button>(R.id.btn2).setOnClickListener {
//            it.findNavController().navigate(R.id.action_recommendFragment2_to_carefulFragment2)
//
//        }
    }

}