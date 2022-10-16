package com.example.homeworksmitty

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView
import com.google.android.material.button.MaterialButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editSearch: EditText = findViewById(R.id.editSearch)
        findViewById<CardView>(R.id.viewGo).setOnClickListener {
            val text = editSearch.text.toString().trim()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}