package com.treinamento.gerenciadordecartoes.data.remote

import com.treinamento.gerenciadordecartoes.model.Card

/** Formato persistido em users/{uid}/cards/{cardId}. */
data class FirestoreCardEntity(
    val holderName: String = "",
    val lastFourDigits: String = "",
    val brand: String = "",
    val limit: Double = 0.0,
    val usedLimit: Double = 0.0,
    val dueDay: Int = 1,
    val isBlocked: Boolean = false,
) {
    fun toModel(id: String) = Card(
        id = id,
        holderName = holderName,
        lastFourDigits = lastFourDigits,
        brand = brand,
        limit = limit,
        usedLimit = usedLimit,
        dueDay = dueDay,
        isBlocked = isBlocked,
    )

    companion object {
        fun fromModel(card: Card) = FirestoreCardEntity(
            holderName = card.holderName,
            lastFourDigits = card.lastFourDigits,
            brand = card.brand,
            limit = card.limit,
            usedLimit = card.usedLimit,
            dueDay = card.dueDay,
            isBlocked = card.isBlocked,
        )
    }
}
