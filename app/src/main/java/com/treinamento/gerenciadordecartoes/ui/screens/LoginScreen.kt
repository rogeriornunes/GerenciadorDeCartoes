package com.example.cardmanager.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CreditCard
import androidx.compose.material.icons.rounded.Fingerprint
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardmanager.state.LoginUiState
import com.example.cardmanager.ui.components.AppButton

@Composable
fun LoginScreen(
    state: LoginUiState,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLogin: () -> Unit,
) {
    var rememberAccess by remember { mutableStateOf(false) }
    val fieldColors = OutlinedTextFieldDefaults.colors(
        focusedTextColor = Color.White, unfocusedTextColor = Color.White,
        focusedBorderColor = Color(0xFF6AA7F8), unfocusedBorderColor = Color(0xFF5780A9),
        focusedLabelColor = Color.White, unfocusedLabelColor = Color(0xFFD9E6F5), cursorColor = Color.White,
    )
    Column(
        modifier = Modifier.fillMaxSize().background(
            Brush.verticalGradient(listOf(Color(0xFF0B437B), Color(0xFF063260), Color(0xFF052B55)))
        ).padding(horizontal = 28.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.background(
                Brush.linearGradient(listOf(Color(0xFF3B87FA), Color(0xFF6950F3))), RoundedCornerShape(12.dp)
            ).padding(16.dp).align(Alignment.CenterHorizontally),
        ) { Icon(Icons.Rounded.CreditCard, null, tint = Color.White) }
        Spacer(Modifier.height(22.dp))
        Text("Bem-vindo!", color = Color.White, fontSize = 26.sp, fontWeight = FontWeight.Bold, modifier = Modifier.align(Alignment.CenterHorizontally))
        Text("Gerencie seus cartões\ncom segurança e praticidade.", color = Color(0xFFE7F0FA), textAlign = TextAlign.Center, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.height(30.dp))
        OutlinedTextField(state.email, onEmailChange, label = { Text("CPF ou e-mail") }, singleLine = true, colors = fieldColors, shape = RoundedCornerShape(9.dp), modifier = Modifier.fillMaxWidth())
        Spacer(Modifier.height(12.dp))
        OutlinedTextField(state.password, onPasswordChange, label = { Text("Senha") }, singleLine = true, visualTransformation = PasswordVisualTransformation(), colors = fieldColors, shape = RoundedCornerShape(9.dp), modifier = Modifier.fillMaxWidth())
        state.error?.let { Text(it, color = Color(0xFFFFB4AB), modifier = Modifier.padding(top = 8.dp)) }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Checkbox(rememberAccess, { rememberAccess = it })
            Text("Lembrar meu acesso", color = Color.White, style = MaterialTheme.typography.bodySmall)
            Spacer(Modifier.weight(1f))
            Text("Esqueci minha senha", color = Color(0xFFBDD6F1), style = MaterialTheme.typography.bodySmall)
        }
        Spacer(Modifier.height(18.dp))
        AppButton("Entrar", onLogin, loading = state.isLoading)
        Spacer(Modifier.height(20.dp))
        Text("ou entre com", color = Color(0xFFC9DAEB), modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.height(12.dp))
        Box(Modifier.align(Alignment.CenterHorizontally).border(1.dp, Color(0xFF5F83A8), RoundedCornerShape(12.dp)).padding(12.dp)) {
            Icon(Icons.Rounded.Fingerprint, "Entrar com biometria", tint = Color.White)
        }
        Spacer(Modifier.height(18.dp))
        Text("Ainda não tem conta? Cadastre-se", color = Color(0xFFD7E5F3), style = MaterialTheme.typography.bodySmall, modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}
