package com.example.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NicknameActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname2)
        val btn = findViewById<Button>(R.id.changeBtn)
        val edit = findViewById<EditText>(R.id.nicknameEdt)
        btn.setOnClickListener {
            val nickname = edit.text.toString()
            val changeIntent = Intent()
            changeIntent.putExtra("nickname", nickname)
            setResult(RESULT_OK, changeIntent)
            finish()
        }
// 변경버튼을 누르면 edit의 텍스트를 닉네임의 실제값으로 변경



    }
}