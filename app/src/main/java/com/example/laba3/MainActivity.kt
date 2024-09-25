package com.example.laba3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mainTextEditText = findViewById<EditText>(R.id.main_Text)
        val calculateButton = findViewById<Button>(R.id.button)
        val countTextView = findViewById<TextView>(R.id.label1)

        calculateButton.setOnClickListener {
            val inputText = mainTextEditText.text.toString()
            val letterCount = countLetters(inputText)
            countTextView.text = "Количество букв: $letterCount"
        }

    }
    private fun countLetters(text: String): Int {
        var count = 0
        for (char in text) {
            if (char.isLetter() && char.isLetter()) { // Проверяем, является ли символ латинской буквой
                count++
            }
        }
        return count
    }

}