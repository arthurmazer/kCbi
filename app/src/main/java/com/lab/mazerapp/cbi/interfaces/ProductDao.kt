package com.lab.mazerapp.cbi.interfaces

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.lab.mazerapp.cbi.models.Product
import com.lab.mazerapp.cbi.utils.TABLE_PRODUCTS

@Dao
interface ProductDao {

    @Query("SELECT * FROM $TABLE_PRODUCTS")
    fun getAllProducts() : List<Product>

    @Insert
    fun insertProduct(product: Product)

    @Update
    fun updateProduct(product: Product)
}