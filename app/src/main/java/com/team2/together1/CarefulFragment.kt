package com.team2.together1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.findFragment
import androidx.navigation.findNavController
import com.team2.together1.databinding.FragmentCarefulBinding

class CarefulFragment : Fragment() {

    lateinit var binding: FragmentCarefulBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCarefulBinding.inflate(inflater, container, false)

        binding.btnPost.setOnClickListener {
            startActivity(Intent(activity, PostActivity::class.java))
        }

        binding.string1.setOnClickListener {
            startActivity(Intent(activity, DetailActivity::class.java))
        }

        return binding.root
    }


}
