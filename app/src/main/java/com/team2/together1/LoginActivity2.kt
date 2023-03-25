package com.team2.together1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityLogin2Binding
import com.team2.together1.databinding.ActivityLoginBinding

class LoginActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDone.setOnClickListener{
            startActivity(Intent(this, LoginActivity3::class.java))
        }
    }
}