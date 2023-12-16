package com.krushal.jdkshoppers.model

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Product::class], version = 2, exportSchema = false)
abstract class ProductDataBase :RoomDatabase(){

    abstract fun productsDao():ProductDao

}