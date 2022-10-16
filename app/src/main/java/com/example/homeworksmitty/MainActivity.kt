package com.example.homeworksmitty

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var textWelcomeSmitty: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textWelcomeSmitty = findViewById(R.id.textWelcomeSmitty)
        findViewById<MaterialButton>(R.id.btnHome).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            response.launch(intent)
        }
    }

    private val response = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode == Activity.RESULT_OK){
            textWelcomeSmitty.text = it.data?.getStringExtra("name").toString().trim()
        }
    }
}