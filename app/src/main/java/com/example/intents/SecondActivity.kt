package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btIntent=findViewById<Button>(R.id.hbutton)
        btIntent.setOnClickListener {
            // back to home screen
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}