package com.example.warmfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_layout)
        supportActionBar?.hide()    // 상단 액션바 숨기기
    }
}