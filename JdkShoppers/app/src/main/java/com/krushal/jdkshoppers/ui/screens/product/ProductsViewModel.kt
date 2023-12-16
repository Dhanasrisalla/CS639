package com.krushal.jdkshoppers.ui.screens.product

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.krushal.jdkshoppers.model.Product
import com.krushal.jdkshoppers.model.ProductRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val productRepository: ProductRepo
) : ViewModel() {

    private val _productList = MutableLiveData<List<Product>>(listOf())
    val productList: LiveData<List<Product>> = _productList

    init {
        viewModelScope.launch {
            productRepository.deleteAll()
            productRepository.seedProducts()
            fetchProductList()
        }
    }

    private fun fetchProductList() {
        viewModelScope.launch {
            _productList.value = productRepository.allProducts()
        }
    }


    private val _cartItems = mutableStateListOf<Product>()
    val cartItems: List<Product> = _cartItems

    fun addToCart(product: Product) {
        _cartItems.add(product)
    }

    fun removeFromCart(cartItem: Product) {
        _cartItems.remove(cartItem)
    }

    fun clearCart() {
        _cartItems.clear()
    }


}
