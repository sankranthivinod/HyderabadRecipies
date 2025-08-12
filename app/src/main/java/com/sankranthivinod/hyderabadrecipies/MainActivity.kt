package com.sankranthivinod.hyderabadrecipies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.sankranthivinod.hyderabadrecipies.navigation.AppNavGraph
import com.sankranthivinod.hyderabadrecipies.ui.theme.HyderabadRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HyderabadRecipesTheme {
                val navController = rememberNavController()
                AppNavGraph(navController)
            }
        }
    }
}
