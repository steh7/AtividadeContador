package com.example.gabyb3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gabyb3.ui.theme.GabyB3Theme
import com.example.gabyb3.view.MainView
import com.example.gabyb3.view.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val meuViewModel = MainViewModel()
        setContent {
            GabyB3Theme {
               Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   MainView(meuViewModel)
               }
            }
        }
    }
}