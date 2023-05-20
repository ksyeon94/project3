package com.example.project3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NicknameActivity : AppCompatActivity() {
    val REQUEST = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname)

        val btn = findViewById<Button>(R.id.nicknameChange)

        val nextIntent = Intent(this, NicknameActivity2::class.java)
        btn.setOnClickListener {
            startActivityForResult(nextIntent, REQUEST)
        }

            //변경버튼(changebtn)을 누르면 화면이동
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val nickname = findViewById<TextView>(R.id.nickname)
        if (requestCode==REQUEST) {
            if(resultCode== RESULT_OK){
              val change = data?.getStringExtra("nickname")
                nickname.text = change
            }
        }
    }
}