package com.uc.forestq.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uc.forestq.R
import com.uc.forestq.databinding.ActivityAuthPageBinding
import com.uc.forestq.databinding.ActivityMainBinding

class AuthPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}