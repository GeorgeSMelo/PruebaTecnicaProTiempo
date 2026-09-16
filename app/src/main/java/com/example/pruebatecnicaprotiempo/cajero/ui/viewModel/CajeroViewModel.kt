package com.example.pruebatecnicaprotiempo.cajero.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.pruebatecnicaprotiempo.cajero.domain.CajeroUiState
import com.example.pruebatecnicaprotiempo.cajero.domain.MonedaResultado
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class CajeroViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(CajeroUiState())
    val uiState: StateFlow<CajeroUiState> = _uiState.asStateFlow()

    private val monedas = listOf(1000,500,200,100,50,20,10)

    fun calcular(valor: Int) {
        if (valor <= 0) {
            _uiState.value = CajeroUiState(
                error = "Ingresa un valor mayor a 0"
            )
            return
        }
        var restante = valor
        val resultado = mutableListOf<MonedaResultado>()

        for (moneda in monedas) {
            val cantidad = restante / moneda
            if (cantidad > 0) {
                resultado.add(
                    MonedaResultado(
                        denominacion = moneda,
                        cantidad = cantidad
                    )
                )
                restante %= moneda

            }
        }
        if (restante != 0) {
            _uiState.value = CajeroUiState(
                error = "El valor $valor no puede representarse exactamente con las monedas disponibles"
            )
            return
        }
        _uiState.value = CajeroUiState(
            resultado = resultado,
            totalMonedas = resultado.sumOf { it.cantidad }
        )
    }

}