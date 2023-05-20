package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//import android.util.Log
//import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_log_in.sign_up

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val id = findViewById<EditText>(R.id.id)
        val pw = findViewById<EditText>(R.id.password)
        val sign_up = findViewById<Button>(R.id.sign_up)
        val log_in = findViewById<Button>(R.id.log_in)
        log_in.setOnClickListener {
            val servicenumber = id.text.toString()
            val password = pw.text.toString()
            if (servicenumber=="1810019" && password=="1234"){
                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
            }

        }
        sign_up.setOnClickListener {
//            회원가입 누르면 해당 페이지로 넘어가는것
//            id가 1810019이면서 비밀번호가 1234 이면 관리자입니다 뜨게하기

            Log.d("로그인화면 로그", "회원가입버튼눌림")

        }
    }
}