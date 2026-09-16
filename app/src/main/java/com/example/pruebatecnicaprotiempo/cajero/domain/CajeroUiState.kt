package com.example.pruebatecnicaprotiempo.cajero.domain

data class CajeroUiState(
    val resultado: List<MonedaResultado> = emptyList(),
    val totalMonedas: Int = 0,
    val error: String? = null
)
