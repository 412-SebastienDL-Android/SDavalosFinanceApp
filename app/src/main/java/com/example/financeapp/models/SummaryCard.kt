package com.example.financeapp.models

import androidx.compose.ui.graphics.Color

data class SummaryCard(
    val titulo: String,
    val monto: String,
    val backgroundColor: Color
)

val Tarjeta = listOf(
    SummaryCard(
        titulo = "Actividad de la Semana",
        monto = "",
        backgroundColor = Color(0xFFDCEFE8)
    ),
    SummaryCard(
        titulo = "Ventas",
        monto = "$280.99",
        backgroundColor = Color(0xFFF5EDE4)
    ),
    SummaryCard(
        titulo = "Ganancias",
        monto = "$280.99",
        backgroundColor = Color(0xFFE8E4F5)
    )
)