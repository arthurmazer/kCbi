package com.lab.mazerapp.cbi.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.lab.mazerapp.cbi.models.Contact

class ContactViewModel : ViewModel() {

    private lateinit var contactList: MutableLiveData<List<Contact>>

    fun getContactList() : LiveData<List<Contact>> {
        return contactList
    }

}