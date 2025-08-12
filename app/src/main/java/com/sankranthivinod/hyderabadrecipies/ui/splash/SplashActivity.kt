package com.sankranthivinod.hyderabadrecipies.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sankranthivinod.hyderabadrecipies.ui.dashboard.DashboardActivity
import com.sankranthivinod.hyderabadrecipies.ui.theme.HyderabadRecipesTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HyderabadRecipesTheme {
                val splashViewModel: SplashViewModel = viewModel()

                splashViewModel.startSplashTimer {
                    // Navigate to DashboardActivity
                    startActivity(Intent(this, DashboardActivity::class.java))
                    finish()
                }
            }
        }
    }
}
