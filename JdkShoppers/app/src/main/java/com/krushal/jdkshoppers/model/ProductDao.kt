package com.krushal.jdkshoppers.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM products")
    suspend fun getAllProducts(): List<Product>

    @Insert
    suspend fun insert(product: Product)

    @Query("DELETE FROM products")
    suspend fun deleteAllProducts()

}