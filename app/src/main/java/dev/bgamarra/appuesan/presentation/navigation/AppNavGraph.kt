package dev.bgamarra.appuesan.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.bgamarra.appuesan.presentation.auth.LoginScreen
import dev.bgamarra.appuesan.presentation.auth.RegisterScreen
import dev.bgamarra.appuesan.presentation.home.HomeScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "login")
    {
        composable(route = "register"){ RegisterScreen(navController = navController) }
        composable(route = "login"){ LoginScreen(navController = navController) }
        composable(route = "home"){
            DrawerScaffold(navController) {
                HomeScreen()
            }
        }
    }
}