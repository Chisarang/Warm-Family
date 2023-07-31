package com.example.warmfamily.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.warmfamily.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_layout)
        supportActionBar?.hide()    // 상단 액션바 숨기기


    }
}