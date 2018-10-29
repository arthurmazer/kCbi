package com.lab.mazerapp.cbi.repositories

import android.arch.lifecycle.LiveData
import com.lab.mazerapp.cbi.interfaces.ProductDao
import com.lab.mazerapp.cbi.models.Product

abstract class MenuRepositories {

    abstract val productDao : ProductDao

    fun getAllProducts() : LiveData<List<Product>> { return productDao.getAllProducts()}
    fun insertProduct(product : Product){ productDao.insertProduct(product)}
}