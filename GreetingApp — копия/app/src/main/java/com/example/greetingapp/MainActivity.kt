package com.example.greetingapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.greetingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.groupTextView.text = "Группа: 22ИСП3"


        binding.startButton.setOnClickListener {
            binding.welcomeTextView.visibility = View.VISIBLE
            binding.welcomeImageView.visibility = View.VISIBLE
        }
    }
}
