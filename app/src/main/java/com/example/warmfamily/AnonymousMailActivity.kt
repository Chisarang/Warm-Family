package com.example.warmfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 익명 메일
class AnonymousMailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anonymous_mail_layout)
        supportActionBar?.hide();
    }
}