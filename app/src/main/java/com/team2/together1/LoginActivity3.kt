package com.team2.together1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityLogin2Binding
import com.team2.together1.databinding.ActivityLogin3Binding

class LoginActivity3 : AppCompatActivity() {
    private lateinit var binding : ActivityLogin3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDone.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}