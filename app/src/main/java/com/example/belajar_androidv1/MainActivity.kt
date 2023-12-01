package com.example.belajar_androidv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text ="Hallo"

        buttonButton.setOnClickListener {
            val name = nameEditText.text.toString()
            buttonTextView.text = "Hallo $name"
        }
    }

}