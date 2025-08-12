package com.sankranthivinod.hyderabadrecipies.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen(onNavigateToDashboard: () -> Unit) {
    val viewModel: SplashViewModel = viewModel()
    val navigate = viewModel.shouldNavigate.value

    if (navigate) {
        onNavigateToDashboard()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hyderabad Recipes 🍛",
            fontSize = 28.sp,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}
