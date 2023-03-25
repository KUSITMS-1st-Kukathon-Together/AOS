package com.team2.together1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityPostBinding

class PostActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCareful.setOnClickListener {
            binding.btnCareful.setBackgroundResource(R.drawable.bg_button_orange)
            binding.btnCareful.setTextColor(Color.parseColor("#FF7A00"))
        }
        binding.btnRecommend.setOnClickListener {
            binding.btnRecommend.setBackgroundResource(R.drawable.bg_button_orange)
            binding.btnRecommend.setTextColor(Color.parseColor("#FF7A00"))
        }

        binding.btnDone.setOnClickListener{
            startActivity(Intent(this, Post1Activity::class.java))
        }
    }
}