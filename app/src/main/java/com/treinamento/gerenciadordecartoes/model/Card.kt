package com.example.cardmanager.model

data class Card(
    val id: String,
    val holderName: String,
    val lastFourDigits: String,
    val brand: String,
    val limit: Double,
    val usedLimit: Double,
    val dueDay: Int,
    val isBlocked: Boolean = false,
) {
    val availableLimit: Double get() = limit - usedLimit
}
