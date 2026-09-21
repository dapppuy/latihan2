package com.example.latihan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    NavigationApp()
                }
            }
        }
    }
}

@Composable
fun NavigationApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "screen1"
    ) {
        composable("screen1") {
            Screen1(
                onNavigateToScreen2 = {
                    navController.navigate("screen2")
                }
            )
        }

        composable("screen2") {
            Screen2()
        }
    }
}

@Composable
fun Screen1(onNavigateToScreen2: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen 1",
            fontSize = 28.sp
        )

        Text(
            text = "Nama: Dafa Luthfan Otter",
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "NIM: 245150407111068",
            modifier = Modifier.padding(top = 4.dp)
        )

        Button(
            onClick = onNavigateToScreen2,
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text(text = "Ke Halaman 2")
        }
    }
}

@Composable
fun Screen2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen 2",
            fontSize = 28.sp
        )

        Text(
            text = "Nama: Dafa Luthfan Otter",
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "NIM: 245150407111068",
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}