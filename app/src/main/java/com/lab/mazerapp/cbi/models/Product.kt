package com.lab.mazerapp.cbi.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by arthurmazer on 21-Nov-17.
 */
@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true)  val idFood: Int,
    @ColumnInfo(name = "name") val nameFood: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "price") val price: Float)