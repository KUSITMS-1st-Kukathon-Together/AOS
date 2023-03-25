package com.team2.together1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WritingActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writing)

        val beCareful = findViewById<Button>(R.id.button)
        beCareful.setOnClickListener{
        }

        var intent = Intent(this, WritingActivity2::class.java)
        startActivity(intent)

        val recommend = findViewById<Button>(R.id.button2)
        beCareful.setOnClickListener{
        }

        var intent2 = Intent(this, WritingActivity2_2::class.java)
        startActivity(intent2)
    }



}