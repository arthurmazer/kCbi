package com.lab.mazerapp.cbi

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.util.Log
import com.lab.mazerapp.cbi.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.support.annotation.IdRes
import android.support.annotation.Nullable
import android.support.v4.app.FragmentTransaction
import com.lab.mazerapp.cbi.fragments.MenuFragmentContent


class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        loadFragmentContent(0)
    }

    fun initViews() {
        view_pager.adapter =  ViewPagerAdapter(supportFragmentManager)
        view_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {}
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {}
            override fun onPageSelected(p0: Int) {loadFragmentContent(p0)}
        })
    }

    fun loadFragmentContent(position : Int) {
        var ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.content_panel, MenuFragmentContent())
        ft.commit()
    }

    fun addFragment(@IdRes containerViewId: Int,
        fragment: Fragment,
        fragmentTag: String
    ){
        supportFragmentManager
            .beginTransaction()
            .add(containerViewId, fragment, fragmentTag)
            .disallowAddToBackStack()
            .commit()
    }

    fun replaceFragment(@IdRes containerViewId: Int,
        fragment: Fragment,
        fragmentTag: String,
        @Nullable backStackStateName: String
    ){
        supportFragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment, fragmentTag)
            .addToBackStack(backStackStateName)
            .commit()
    }


}
