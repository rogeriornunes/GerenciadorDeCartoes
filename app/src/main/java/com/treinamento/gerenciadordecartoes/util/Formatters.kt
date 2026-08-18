package com.treinamento.gerenciadordecartoes.util

import java.text.NumberFormat
import java.util.Locale

fun Double.toCurrency(): String = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR")).format(this)
