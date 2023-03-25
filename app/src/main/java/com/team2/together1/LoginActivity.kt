package com.team2.together1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityLoginBinding
import com.team2.together1.databinding.ActivityPost1Binding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}