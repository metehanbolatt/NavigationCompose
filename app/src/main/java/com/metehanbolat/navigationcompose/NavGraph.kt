package com.metehanbolat.navigationcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(
                navController = navController
            )
        }
        composable(
            route = Screen.Detail.route
        ){
            DetailScreen(
                navController = navController
            )
        }
    }
}