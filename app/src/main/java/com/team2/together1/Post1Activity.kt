package com.team2.together1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityPost1Binding

class Post1Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPost1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPost1Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        btn_careful3

        binding.btnCareful.setOnClickListener {
            binding.btnCareful.setBackgroundResource(R.drawable.bg_button_orange)
            binding.btnCareful.setTextColor(Color.parseColor("#FF7A00"))
        }
        binding.btnCareful2.setOnClickListener {
            binding.btnCareful2.setBackgroundResource(R.drawable.bg_button_orange)
            binding.btnCareful2.setTextColor(Color.parseColor("#FF7A00"))
        }
        binding.btnCareful3.setOnClickListener {
            binding.btnCareful3.setBackgroundResource(R.drawable.bg_button_orange)
            binding.btnCareful3.setTextColor(Color.parseColor("#FF7A00"))
        }

        binding.setLocation.setOnClickListener{
            startActivity(Intent(this, MapsActivity::class.java))
        }

    }
}