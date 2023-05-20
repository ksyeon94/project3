package com.example.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val nextBtn=findViewById<Button>(R.id.nextToSignup)
        nextBtn.setOnClickListener {
            val signup2intent = Intent(this, Signup2Activity::class.java)
            startActivity(signup2intent)
        }
    }
}