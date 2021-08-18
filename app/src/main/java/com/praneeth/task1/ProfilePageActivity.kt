package com.praneeth.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.praneeth.task1.databinding.ActivityProfilePageBinding

class ProfilePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfilePageBinding
    private lateinit var adapter1: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfilePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        adapter1= ViewPagerAdapter(fragmentManager,lifecycle)
        binding.viewPager2.adapter = adapter1


        binding.apply {

            tabLayout.addTab(tabLayout.newTab().setText("Uploads").setIcon(R.drawable.ic_group10copy__1_,))
            tabLayout.addTab(tabLayout.newTab().setText("Exhibitions").setIcon(R.drawable.ic_group6copy__1_))
            tabLayout.addTab(tabLayout.newTab().setText("Revenue").setIcon(R.drawable.ic_group3copy__2_))

            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {

                    viewPager2.setCurrentItem(tab!!.position)

                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }
            })


            viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    tabLayout.selectTab(tabLayout.getTabAt(position))
                }

            })

        }

    }
}