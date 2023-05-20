package com.example.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Practice2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice2)

        val btn = findViewById<Button>(R.id.sendBtn)
        val view = findViewById<EditText>(R.id.messageEdt)

        btn.setOnClickListener {
            val viewString = view.text.toString()
            val sendTo2_2 = Intent(this, Practice2_2::class.java)
            sendTo2_2.putExtra("message", viewString)
            startActivity(sendTo2_2)
        }
    }

    // 버튼 클릭시 내용(messageEdt)의 텍스트를 스트링으로 변환해서 2_2의 text화면으로보내기
}