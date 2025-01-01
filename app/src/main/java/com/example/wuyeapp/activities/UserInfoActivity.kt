package com.example.wuyeapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wuyeapp.R
import com.example.wuyeapp.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 实现用户信息页的逻辑
    }
}
