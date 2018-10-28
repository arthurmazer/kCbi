package com.lab.mazerapp.cbi.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.lab.mazerapp.cbi.interfaces.ProductDao
import com.lab.mazerapp.cbi.models.Product
import com.lab.mazerapp.cbi.utils.DATABASE_NAME
import com.lab.mazerapp.cbi.utils.DATABASE_VERSION

@Database(entities = [Product::class], version = DATABASE_VERSION)
abstract class AppDatabase : RoomDatabase(){

    companion object {
        var _instance : AppDatabase? = null
        fun getInstance(context: Context) : AppDatabase?{
            if (_instance == null){
                synchronized(AppDatabase::class){
                    _instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DATABASE_NAME).build()
                }
            }
            return _instance
        }

        fun destroyInstance(){
            _instance = null
        }
    }
    abstract fun productDao() : ProductDao
}