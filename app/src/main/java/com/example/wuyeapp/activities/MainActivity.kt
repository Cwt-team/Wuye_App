package com.example.wuyeapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.wuyeapp.R
import com.example.wuyeapp.fragments.HomeFragment
import com.example.wuyeapp.fragments.UnlockFragment
import com.example.wuyeapp.fragments.MyFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView

    // 定义各个Fragment
    private val homeFragment = HomeFragment()
    private val unlockFragment = UnlockFragment()
    private val myFragment = MyFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_nav)

        // 默认显示主页
        replaceFragment(homeFragment)

        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    replaceFragment(homeFragment)
                    true
                }
                R.id.nav_unlock -> {
                    replaceFragment(unlockFragment)
                    true
                }
                R.id.nav_my -> {
                    replaceFragment(myFragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
