package com.treinamento.gerenciadordecartoes.model

data class Purchase(
    val id: String,
    val cardId: String,
    val merchant: String,
    val date: String,
    val amount: Double,
    val category: String,
)
