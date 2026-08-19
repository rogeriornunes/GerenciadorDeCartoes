package com.treinamento.gerenciadordecartoes.model

data class CardRequest(
    val holderName: String,
    val cardType: String,
    val requestedLimit: Double,
)
