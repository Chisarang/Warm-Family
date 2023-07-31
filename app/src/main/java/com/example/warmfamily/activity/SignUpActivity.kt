package com.example.warmfamily.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnFocusChangeListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.warmfamily.R
import org.w3c.dom.CharacterData
import org.w3c.dom.Text

class SignUpActivity : AppCompatActivity() {

    // EditText
    lateinit var nameEditText: EditText
    lateinit var idEditText: EditText
    lateinit var pwEditText: EditText
    lateinit var pwConfirmEditText: EditText
    lateinit var birthEditText: EditText

    lateinit var submitButton: Button

    lateinit var nameErrorTextView: TextView
    lateinit var idErrorTextView: TextView
    lateinit var pwErrorTextView: TextView
    lateinit var pwConfirmErrorTextView: TextView
    lateinit var birthErrorTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_layout)
        supportActionBar?.hide()    // 상단 액션바 숨기기

        // view 가져오기
        // editText
        nameEditText = findViewById<EditText>(R.id.name_text)
        idEditText = findViewById<EditText>(R.id.id_text)
        pwEditText = findViewById<EditText>(R.id.pw_text)
        pwConfirmEditText = findViewById<EditText>(R.id.pw_confirm_text)
        birthEditText = findViewById<EditText>(R.id.birth_text)
        // button
        submitButton = findViewById<Button>(R.id.join_submit_btn)
        // errorText
        nameErrorTextView = findViewById<TextView>(R.id.name_error_text)
        idErrorTextView = findViewById<TextView>(R.id.id_error_text)
        pwErrorTextView = findViewById<TextView>(R.id.pw_error_text)
        pwConfirmErrorTextView = findViewById<TextView>(R.id.pw_confirm_error_text)
        birthErrorTextView = findViewById<TextView>(R.id.birth_error_text)

        // EditText가 blur되었을 때 유효성 검사
        nameEditText.setOnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                // 포커스 되었을 때
            } else {
                checkName(nameEditText.text.toString())
            }
        }

        idEditText.setOnFocusChangeListener{  view, hasFocus ->
            if (hasFocus) {
                // 포커스 되었을 때
            } else {
                checkId(idEditText.text.toString())
            }
        }

        pwEditText.setOnFocusChangeListener{ view, hasFocus ->
            if (hasFocus) {

            } else {
                checkPw(pwEditText.text.toString())
            }
        }
    }

    fun checkName(name: String?){
        // 공백 또는 null
        if (name.isNullOrBlank()){
            nameErrorTextView.visibility = View.VISIBLE;
            return
        }
        name?.let {
            // 글자 수
            if (name.length > 20){
                nameErrorTextView.visibility = View.VISIBLE
                return
            }

            // TODO: name이 숫자일 경우에도 error 처리를 하는지?

            // 조건을 통과했을 때
            nameErrorTextView.visibility = View.INVISIBLE
        }
    }

    fun checkId(id: String?){
        // 공백 또는 null
        if (id.isNullOrBlank()){
            idErrorTextView.visibility = View.VISIBLE
            return
        }

        // 영문 또는 숫자로만, 6-12자, -_
        id?.let {
            val regex = "^[a-zA-Z0-9-_]{6,12}$".toRegex();
            if (!regex.matches(id)){
                idErrorTextView.visibility = View.VISIBLE
                return
            }
            
            idErrorTextView.visibility = View.INVISIBLE
        }
    }

    fun checkPw(pw: String?){
        // 공백 또는 null
        if (pw.isNullOrBlank()) {
            pwErrorTextView.visibility = View.VISIBLE
            return
        }

        pw?.let {
            // 글자 수 확인
            if(pw.length < 8 || pw.length > 20){
                pwErrorTextView.visibility = View.VISIBLE
                return
            }
            val numberRegex = "\\d".toRegex()
            val specialCharRegex = "[^!@#$%^&*-_]".toRegex()
            val englishCharRegex = "[^a-zA-Z]".toRegex()

            if (!numberRegex.containsMatchIn(pw) ||
                !specialCharRegex.containsMatchIn(pw) ||
                !englishCharRegex.containsMatchIn(pw) ){
                pwErrorTextView.visibility = View.VISIBLE
                return
            }

            pwErrorTextView.visibility = View.INVISIBLE
        }
    }


}