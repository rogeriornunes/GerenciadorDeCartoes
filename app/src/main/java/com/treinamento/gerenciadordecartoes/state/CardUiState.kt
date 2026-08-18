package com.treinamento.gerenciadordecartoes.state

import com.treinamento.gerenciadordecartoes.model.Card
import com.treinamento.gerenciadordecartoes.model.Purchase

data class CardUiState(
    val cards: List<Card> = emptyList(),
    val selectedCardId: String? = null,
    val purchases: List<Purchase> = emptyList(),
    val isLoading: Boolean = false,
    val message: String? = null,
) {
    val selectedCard: Card? get() = cards.firstOrNull { it.id == selectedCardId }
}
