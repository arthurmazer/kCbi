package com.lab.mazerapp.cbi.interfaces

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.lab.mazerapp.cbi.models.Contact
import com.lab.mazerapp.cbi.utils.TABLE_CONTACTS

@Dao
interface ContactDao {

    @Query("SELECT * FROM $TABLE_CONTACTS")
    fun getAllContacts() : List<Contact>

    @Insert
    fun insertContact(contact: Contact)

    @Update
    fun updateContact(contact: Contact)
}