package com.team2.together1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityFirst2Binding
import com.team2.together1.databinding.ActivityFirstBinding

class FirstActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityFirst2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirst2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.string6.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}