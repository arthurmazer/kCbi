package com.lab.mazerapp.cbi.interfaces

import android.arch.persistence.room.Query
import com.lab.mazerapp.cbi.models.Product

interface ProductDao {

    @Query("SELECT * FROM products")
    fun getAllProducts() : List<Product>
}