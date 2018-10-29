package com.lab.mazerapp.cbi.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.lab.mazerapp.cbi.fragments.ContactFragmentHeader
import com.lab.mazerapp.cbi.fragments.MenuFragmentHeader

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){


    private val pageCount = 2

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> MenuFragmentHeader()
            1 -> ContactFragmentHeader()
            else -> MenuFragmentHeader()
        }
    }

    override fun getCount(): Int {
        return pageCount
    }

}