package com.uc.forestq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uc.forestq.databinding.ActivityHomeBinding
import com.uc.forestq.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}