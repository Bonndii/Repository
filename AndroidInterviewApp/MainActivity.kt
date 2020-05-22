package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login_btn.setOnClickListener {
            var LIintent=Intent(this,ProfileActivity::class.java)
            if(email_et.text.toString().equals("User1@mail.ru") && password_et.text.toString().equals("Password1")
                || email_et.text.toString().equals("User2@mail.ru") && password_et.text.toString().equals("Password2"))
            startActivity(LIintent) else "Ошибка при вводе почты или пароля"
        }

    }
}
