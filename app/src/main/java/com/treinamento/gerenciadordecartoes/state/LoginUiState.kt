package com.example.cardmanager.state

data class LoginUiState(
    val email: String = "aluno@exemplo.com",
    val password: String = "1234",
    val isLoading: Boolean = false,
    val error: String? = null,
)
