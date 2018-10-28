package com.lab.mazerapp.cbi.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.lab.mazerapp.cbi.models.Product

class MenuViewModel : ViewModel() {

    private lateinit var menuList: MutableLiveData<List<Product>>


    fun getMenuList() : LiveData<List<Product>>{
        return menuList
    }
}