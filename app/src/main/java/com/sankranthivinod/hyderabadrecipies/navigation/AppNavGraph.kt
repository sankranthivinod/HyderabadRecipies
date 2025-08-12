package com.sankranthivinod.hyderabadrecipies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sankranthivinod.hyderabadrecipies.ui.dashboard.DashboardScreen
import com.sankranthivinod.hyderabadrecipies.ui.splash.SplashScreen

object Routes {
    const val Splash = "splash"
    const val Dashboard = "dashboard"
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Splash) {
        composable(Routes.Splash) {
            SplashScreen(
                onNavigateToDashboard = {
                    navController.navigate(Routes.Dashboard) {
                        popUpTo(Routes.Splash) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.Dashboard) {
            DashboardScreen()
        }
    }
}
