package com.treinamento.gerenciadordecartoes.navigation

sealed class AppRoute(val route: String) {
    data object Login : AppRoute("login")
    data object Cards : AppRoute("cards")
    data object Details : AppRoute("details/{cardId}") {
        fun create(cardId: String) = "details/$cardId"
    }
    data object Request : AppRoute("request")
    data object Manage : AppRoute("manage/{cardId}") {
        fun create(cardId: String) = "manage/$cardId"
    }
}
