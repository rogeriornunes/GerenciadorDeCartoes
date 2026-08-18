package com.example.cardmanager.model

data class CardRequest(
    val holderName: String,
    val cardType: String,
    val requestedLimit: Double,
)
