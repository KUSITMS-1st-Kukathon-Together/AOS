package com.team2.together1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.team2.together1.databinding.ActivityFirstBinding
import com.team2.together1.databinding.ActivityLoginBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, FirstActivity2::class.java))
        }
    }
}