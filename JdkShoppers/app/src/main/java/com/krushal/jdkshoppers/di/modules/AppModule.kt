package com.krushal.jdkshoppers.di.modules

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.krushal.jdkshoppers.ui.screens.product.ProductsViewModel
import com.krushal.jdkshoppers.model.ProductDao
import com.krushal.jdkshoppers.model.ProductDataBase
import com.krushal.jdkshoppers.model.ProductRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPref(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences(Constants.SHARED_PREF_NAME, Context.MODE_PRIVATE)

    @Singleton
    @Provides
    fun provideUserDatabase(@ApplicationContext context: Context): ProductDataBase {
        return Room.databaseBuilder(
            context,
            ProductDataBase::class.java,
            "product_database"
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideProductDao(productDataBase: ProductDataBase): ProductDao {
        return productDataBase.productsDao()
    }

    @Provides
    @Singleton
    fun provideProductRepo(productDao: ProductDao): ProductRepo {
        return ProductRepo(productDao = productDao)
    }

    @Provides
    @Singleton
    fun provideProductViewModel(productRepo: ProductRepo): ProductsViewModel {
        return ProductsViewModel(productRepo)
    }
}