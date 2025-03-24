package com.example.navigationapplab5

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapplab5.screens.FirstScreen
import com.example.navigationapplab5.screens.SecondScreen
import com.example.navigationapplab5.screens.ThirdScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "first_screen"
    ) {
        composable("first_screen") {
            FirstScreen(navController)
        }
        composable("second_screen") {
            SecondScreen(navController)
        }
        composable("third_screen") {
            ThirdScreen(navController)
        }
    }
}