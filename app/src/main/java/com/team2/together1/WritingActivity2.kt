package com.team2.together1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WritingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrting2)

        val next = findViewById<Button>(R.id.button3)
        next.setOnClickListener {

        }

        var intent = Intent(this, WritingActivity3::class.java)
        startActivity(intent)


    }
}