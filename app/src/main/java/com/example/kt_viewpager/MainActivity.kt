package com.example.kt_viewpager

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.kt_viewpager.databinding.ActivityMainBinding
import com.example.kt_viewpager.databinding.ItemPagerBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datas = mutableListOf<String>()
        for (i in 1..10) {
            datas.add("item $i")
        }
        binding.viewpager.adapter = MyPagerAdapter(datas)
    }
}