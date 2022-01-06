package com.example.try_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.try_main_fragment)
        val minusButton: Button = findViewById(R.id.appTryMinusBottom)
        val plusButton: Button = findViewById(R.id.appTryPlusBottom)
        val zeroTextView: TextView = findViewById(R.id.appTryZeroText)
        minusButton.setOnClickListener {
            var number = zeroTextView.text.toString().toInt()
            number--
            zeroTextView.text = "$number"
        }
        plusButton.setOnClickListener {
            var number = zeroTextView.text.toString().toInt()
            number++
            zeroTextView.text = "$number"
        }
    }
}