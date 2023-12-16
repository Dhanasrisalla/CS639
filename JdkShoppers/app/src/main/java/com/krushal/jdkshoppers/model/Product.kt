package com.krushal.jdkshoppers.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val productId: Long = 0,
    val category:String,
    val name: String,
    val url: String,
    val price: Double
)