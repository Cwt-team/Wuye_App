package com.example.wuyeapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wuyeapp.R
import com.example.wuyeapp.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 实现设置页的逻辑
    }
}
