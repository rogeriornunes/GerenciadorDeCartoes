package com.example.cardmanager.repository

import com.example.cardmanager.model.Card
import com.example.cardmanager.model.CardRequest
import com.example.cardmanager.model.Purchase
import kotlinx.coroutines.flow.Flow

/** Contrato pronto para receber uma implementação Room/SQLite ou remota. */
interface CardRepository {
    fun observeCards(): Flow<List<Card>>
    fun observePurchases(cardId: String): Flow<List<Purchase>>
    suspend fun authenticate(email: String, password: String): Result<Unit>
    suspend fun requestCard(request: CardRequest): Result<Unit>
    suspend fun setCardBlocked(cardId: String, blocked: Boolean): Result<Unit>
    suspend fun updateLimit(cardId: String, newLimit: Double): Result<Unit>
}
