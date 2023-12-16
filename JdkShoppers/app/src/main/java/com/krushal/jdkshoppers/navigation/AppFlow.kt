package com.krushal.jdkshoppers.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.krushal.jdkshoppers.ui.screens.CartScreen
import com.krushal.jdkshoppers.ui.screens.login.LoginScreen
import com.krushal.jdkshoppers.ui.screens.OrderSuccessScreen
import com.krushal.jdkshoppers.ui.screens.SplashScreen
import com.krushal.jdkshoppers.ui.screens.product.ProductListScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        addSplashScreen(navController)
        addLogin(navController)
        addProductList(navController)
        addCart(navController)
        addOrderPlaced(navController)
    }
}

fun NavGraphBuilder.addLogin(navController: NavController) {
    composable(Screen.Login.route) {
        LoginScreen(
            hiltViewModel()
        ) {
            navController.navigate(Screen.ProductList.route)
        }
    }
}

fun NavGraphBuilder.addProductList(navController: NavController) {
    composable(Screen.ProductList.route) {
        ProductListScreen(hiltViewModel()) {
            navController.navigate(Screen.Cart.route)
        }
    }
}


fun NavGraphBuilder.addCart(navController: NavController) {
    composable(Screen.Cart.route) {
        CartScreen(hiltViewModel()) {
            navController.navigate(Screen.OrderPlaced.route)
        }
    }
}


fun NavGraphBuilder.addOrderPlaced(navController: NavController) {
    composable(Screen.OrderPlaced.route) {
        OrderSuccessScreen()
    }
}

fun NavGraphBuilder.addSplashScreen(navController: NavController) {
    composable(Screen.Splash.route) {
        SplashScreen {
            navController.navigate(Screen.Login.route)
        }
    }
}


