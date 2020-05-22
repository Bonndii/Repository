package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*
import android.content.Intent as Intent

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        signout_btn.setOnClickListener{
            var LOintent=Intent(this,MainActivity::class.java)
            startActivity(LOintent)
        }
    }

}
