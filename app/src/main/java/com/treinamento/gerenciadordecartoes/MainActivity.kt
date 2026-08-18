package com.treinamento.gerenciadordecartoes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.treinamento.gerenciadordecartoes.navigation.CardManagerApp
import com.treinamento.gerenciadordecartoes.ui.theme.CardManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CardManagerTheme { CardManagerApp() } }
    }
}
