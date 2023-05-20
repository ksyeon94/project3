package com.example.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup2)
        //이전클락하면 finish, 가입클릭하면 그건 아직..
        val backbtn=findViewById<Button>(R.id.backToSignupBtn)
        backbtn.setOnClickListener {
            finish()
        }
    }
}