package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_log_in.id
import kotlinx.android.synthetic.main.activity_log_in.sign_up

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        sign_up.setOnClickListener {
//            회원가입 누르면 해당 페이지로 넘어가는것
            Log.d("로그인화면 로그", "회원가입버튼눌림")
            Log.e("로그인화면 에러로그", "회원가입버튼 누를때 에러")

        }
    }
}