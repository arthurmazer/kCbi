package com.lab.mazerapp.cbi.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lab.mazerapp.cbi.AddProduct
import com.lab.mazerapp.cbi.R
import com.lab.mazerapp.cbi.adapters.MenuAdapter
import kotlinx.android.synthetic.main.fragment_menu_content.*
import kotlinx.android.synthetic.main.fragment_menu_content.view.*

class MenuFragmentContent : Fragment()    {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var mView : View =  inflater.inflate(R.layout.fragment_menu_content, container, false)

        initViews(mView)
        return mView
    }

    fun initViews(view : View){
        view.rv_products.layoutManager = LinearLayoutManager(context)
        view.rv_products.itemAnimator = DefaultItemAnimator()
        view.rv_products.adapter = MenuAdapter()

        view.fab_add_menu.setOnClickListener {
            val intent = Intent(context, AddProduct::class.java)
            startActivity(intent)
        }

    }
}