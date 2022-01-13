package com.example.try_application

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import com.example.try_application.databinding.ActivityMainFragmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNextStep()
    }

    private fun initNextStep() {
        with(binding) {
            tryApplicationButton.setOnClickListener {
                it.isGone = true
                appTryMinusBottom.isGone = false
                appTryPlusBottom.isGone = false
                appTryZeroText.isGone = false
            }

            appTryMinusBottom.setOnClickListener {
                appTryZeroText.text = (appTryZeroText.text.toString().toInt() - 1).toString()
            }

            appTryPlusBottom.setOnClickListener {
                appTryZeroText.text = (appTryZeroText.text.toString().toInt() + 1).toString()
            }
        }
    }
}