package com.team2.together1

import android.content.Intent
import android.graphics.Color
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

        binding.btnDone.setOnClickListener{
            var Inputnickname = ""
            Inputnickname = binding.enter.text.toString()
            if (Inputnickname == "together"){
                binding.enter.setBackgroundResource(R.drawable.bg_item_border_orange)
                binding.string4.setTextColor(Color.parseColor("#FF7A00"))

            }
            else {
                startActivity(Intent(this, LoginActivity2::class.java))
            }
        }

    }
}