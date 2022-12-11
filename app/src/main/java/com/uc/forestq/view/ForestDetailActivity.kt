package com.uc.forestq.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uc.forestq.R
import com.uc.forestq.databinding.ActivityForestDetailBinding
import com.uc.forestq.databinding.ActivityMainBinding

class ForestDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForestDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForestDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
    }
}