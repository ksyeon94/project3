package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.parcelize.Parcelize
//import kotlinx.android.synthetic.main.activity_practice1.btn
//import kotlinx.android.synthetic.main.activity_practice1.input
//import kotlinx.android.synthetic.main.activity_practice1.view


class practice1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice1)
        val btn1 = findViewById<Button>(R.id.btn123)
        val input1 = findViewById<EditText>(R.id.input123)
        val view1 = findViewById<TextView>(R.id.view123)

        btn1.setOnClickListener {
            Log.d("로그인버튼 클릭", "클릭했다")
            val input2=input1.text.toString()
            view1.text = input2
            Log.d("출력", input2)
        }


    }
}