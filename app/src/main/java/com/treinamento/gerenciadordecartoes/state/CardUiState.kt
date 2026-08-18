package com.example.cardmanager.state

import com.example.cardmanager.model.Card
import com.example.cardmanager.model.Purchase

data class CardUiState(
    val cards: List<Card> = emptyList(),
    val selectedCardId: String? = null,
    val purchases: List<Purchase> = emptyList(),
    val isLoading: Boolean = false,
    val message: String? = null,
) {
    val selectedCard: Card? get() = cards.firstOrNull { it.id == selectedCardId }
}
