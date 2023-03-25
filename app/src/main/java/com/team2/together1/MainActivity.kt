package com.team2.together1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.team2.together1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation(){

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, CarefulFragment())
            .commitAllowingStateLoss()

        binding.bnvMain.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.first -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, CarefulFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.second-> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, RecommendFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }


            }
            false
        }
    }
}