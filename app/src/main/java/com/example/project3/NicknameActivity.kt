package com.example.project3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        //call 버튼 누르면 에딧의 전화번호를 가져와서 전화앱에 번호띄우기

        val callbtn = findViewById<Button>(R.id.callBtn1)
        val sendBtn = findViewById<Button>(R.id.sendBtn)
        val goNaver = findViewById<Button>(R.id.goToNaver)
        val invite = findViewById<Button>(R.id.invite)

        callbtn.setOnClickListener {
            val phoneNumber = findViewById<EditText>(R.id.phoneNumberEdt).text.toString()
            val callUri = Uri.parse("tel:${phoneNumber}")
            val callIntent = Intent(Intent.ACTION_DIAL, callUri)
            startActivity(callIntent)
        }

        sendBtn.setOnClickListener {
            val phoneNumber = findViewById<EditText>(R.id.phoneNumberEdt).text.toString()
            val callUri = Uri.parse("smsto:${phoneNumber}")
            val callIntent = Intent(Intent.ACTION_SENDTO, callUri)
            callIntent.putExtra("sms_body", "출발하셨나요?")
            startActivity(callIntent)
        }
        goNaver.setOnClickListener {
            //네이버 uri로 가기
            val naverUri = Uri.parse("http://naver.com")
            val naverIntent = Intent(Intent.ACTION_VIEW, naverUri)
            startActivity(naverIntent)
        }

        invite.setOnClickListener {
            val kakaoUri = Uri.parse("https://play.google.com/store/apps/details?id=com.kakao.talk&hl=ko&gl=US")
            val kakaoIntent = Intent(Intent.ACTION_VIEW, kakaoUri)
            startActivity(kakaoIntent)
        }

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