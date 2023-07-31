package com.example.warmfamily.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.warmfamily.R

// 질문 공유
class ShareQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.share_questions_layout)
        supportActionBar?.hide()    // 상단 액션바 숨기기
    }
}