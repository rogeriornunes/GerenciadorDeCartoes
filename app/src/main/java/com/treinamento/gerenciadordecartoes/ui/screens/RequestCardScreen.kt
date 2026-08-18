package com.example.cardmanager.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun RequestCardScreen(
    message: String?,
    contentPadding: PaddingValues,
    onClearMessage: () -> Unit,
    onSubmit: (String, String, String) -> Unit,
) {
    LaunchedEffect(message) { if (message != null) kotlinx.coroutines.delay(3000).also { onClearMessage() } }
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(contentPadding),
        contentPadding = PaddingValues(18.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        item {
            Text("Solicitar Cartão", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, modifier = Modifier.fillMaxWidth(), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            Spacer(Modifier.height(22.dp))
            Text("Escolha o cartão ideal\npara você", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        }
        item { ProductCard("Visa Platinum", "Mais benefícios e segurança para o dia a dia.", listOf("Anuidade grátis", "Programa de pontos", "Benefícios Visa"), listOf(Color(0xFF4434C9), Color(0xFF246EEB))) { onSubmit("Alex Silva", "Visa Platinum", "10000") } }
        item { ProductCard("Mastercard Gold", "Mais vantagens nas suas compras.", listOf("Anuidade grátis", "Programa de pontos", "Assistência viagem"), listOf(Color(0xFFF4C762), Color(0xFFB77A16))) { onSubmit("Alex Silva", "Mastercard Gold", "7000") } }
        item { ProductCard("Visa Internacional", "Ideal para suas viagens e compras.", listOf("Compras internacionais", "Saque no exterior", "Controle pelo app"), listOf(Color(0xFF303C4F), Color(0xFF111927))) { onSubmit("Alex Silva", "Visa Internacional", "5000") } }
        message?.let { item { Text(it, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.SemiBold) } }
    }
}

@Composable
private fun ProductCard(title: String, subtitle: String, benefits: List<String>, colors: List<Color>, onClick: () -> Unit) {
    Surface(shape = RoundedCornerShape(14.dp), color = Color.White, shadowElevation = 3.dp, modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.padding(14.dp), verticalAlignment = Alignment.Top) {
            Box(Modifier.size(width = 70.dp, height = 52.dp).background(Brush.linearGradient(colors), RoundedCornerShape(8.dp)), contentAlignment = Alignment.Center) {
                Text(if (title.contains("Master")) "●●" else "VISA", color = Color.White, fontWeight = FontWeight.Bold)
            }
            Spacer(Modifier.width(14.dp))
            Column(Modifier.weight(1f)) {
                Text(title, fontWeight = FontWeight.Bold)
                Text(subtitle, style = MaterialTheme.typography.bodySmall, color = Color.DarkGray)
                Spacer(Modifier.height(6.dp))
                benefits.forEach { Text("•  $it", style = MaterialTheme.typography.bodySmall) }
                TextButton(onClick = onClick, modifier = Modifier.align(Alignment.End)) { Text("Solicitar", fontWeight = FontWeight.Bold) }
            }
        }
    }
}
