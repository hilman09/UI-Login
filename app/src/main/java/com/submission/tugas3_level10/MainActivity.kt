package com.submission.tugas3_level10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.submission.tugas3_level10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inputEmail.text.toString()
        binding.inputPass.text.toString()
    }



}