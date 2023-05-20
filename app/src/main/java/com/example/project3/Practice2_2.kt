package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Practice2_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice22)
        val viewtxt = findViewById<TextView>(R.id.viewTxt)
        val view = intent.getStringExtra("message")
        viewtxt.text = view

    }
}