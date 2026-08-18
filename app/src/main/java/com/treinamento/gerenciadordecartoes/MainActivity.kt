package com.example.cardmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cardmanager.navigation.CardManagerApp
import com.example.cardmanager.ui.theme.CardManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CardManagerTheme { CardManagerApp() } }
    }
}
