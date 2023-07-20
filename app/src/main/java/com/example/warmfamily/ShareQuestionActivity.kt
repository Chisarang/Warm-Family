package com.example.warmfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// 질문 공유
class ShareQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.share_questions_layout)
        supportActionBar?.hide()    // 상단 액션바 숨기기
    }
}