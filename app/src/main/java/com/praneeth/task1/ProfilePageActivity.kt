package com.praneeth.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.praneeth.task1.databinding.ActivityProfilePageBinding

class ProfilePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfilePageBinding
    private lateinit var adapter1: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfilePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        adapter1= FragmentAdapter(fragmentManager,lifecycle)
        binding.viewPager2.adapter = adapter1




    }
}