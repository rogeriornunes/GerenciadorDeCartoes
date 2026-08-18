package com.example.cardmanager.data

import com.example.cardmanager.model.Card

/** Ponto de extensão para a futura fonte local (DAO do Room/SQLite). */
interface CardDataSource {
    suspend fun getCards(): List<Card>
    suspend fun saveCards(cards: List<Card>)
}
