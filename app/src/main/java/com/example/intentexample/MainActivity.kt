package com.example.intentexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var editUserName : EditText
    private lateinit var editPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData = findViewById(R.id.btn_sendData)
        editUserName = findViewById(R.id.username)
        editPassword = findViewById(R.id.password)

        btnSendData.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username",editUserName.text.toString())
                .putExtra("password",editPassword.text.toString()))
        }

    }
}