package com.krushal.jdkshoppers.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object ProductList : Screen("productList")
    object Cart : Screen("cart")
    object OrderPlaced : Screen("orderPlaced")
    object Splash : Screen("splash")
}