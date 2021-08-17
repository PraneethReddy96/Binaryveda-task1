package com.praneeth.task1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(val fragmentManager: FragmentManager, val lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {

            1-> ExhibitionsFragment()

            2-> RevenueFragment()

        }
         return UploadsFragment()
    }
}