package com.lab.mazerapp.cbi.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.lab.mazerapp.cbi.interfaces.ProductDao
import com.lab.mazerapp.cbi.models.Product
import com.lab.mazerapp.cbi.utils.DATABASE_VERSION

@Database(entities = [Product::class], version = DATABASE_VERSION)
abstract class AppDatabase : RoomDatabase(){

    companion object {
        fun getInstance(context: Context) : AddressDatabase{}
    }

    abstract fun productDao() : ProductDao


}