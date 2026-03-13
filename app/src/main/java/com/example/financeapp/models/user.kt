package com.example.financeapp.models

data class user(
    val nombre: String,
    val saldo: Double
)

val usuario = user(
    nombre = "Sebastien",
    saldo = 280.99
)