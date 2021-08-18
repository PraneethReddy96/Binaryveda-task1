package com.praneeth.task1.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.praneeth.task1.views.fragments.ExhibitionsFragment
import com.praneeth.task1.views.fragments.RevenueFragment
import com.praneeth.task1.views.fragments.UploadsFragment

class ViewPagerAdapter( fragmentManager: FragmentManager,  lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return  3
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {

            1-> return ExhibitionsFragment()

            2-> return RevenueFragment()

        }
         return UploadsFragment()
    }
}