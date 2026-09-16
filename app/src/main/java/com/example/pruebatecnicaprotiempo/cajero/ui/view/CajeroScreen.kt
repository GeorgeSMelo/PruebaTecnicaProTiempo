package com.example.pruebatecnicaprotiempo.cajero.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pruebatecnicaprotiempo.cajero.ui.viewModel.CajeroViewModel

@Composable
fun CajeroScreen(cajeroViewModel: CajeroViewModel) {
    val uiState by cajeroViewModel.uiState.collectAsState()
    var valor by rememberSaveable() { mutableStateOf("") }
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .fillMaxHeight()
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        OutlinedTextField(
            value = valor,
            onValueChange = { nuevoValor ->
                valor = nuevoValor
            },
            label = {
                Text("Ingresa el valor que deseas retirar")
            },
            placeholder = {
                Text("349432")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            onClick = { cajeroViewModel.calcular(valor.toIntOrNull() ?: 0) }

        ) {
            Text("Retirar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        uiState.error?.let {
            Text(text = it)
        }

        uiState.resultado.forEach { moneda ->
            Text(
                text = "${moneda.cantidad}x$${moneda.denominacion}"

            )
        }
        if (uiState.totalMonedas > 0 ){
            Text(
                text = "${uiState.totalMonedas} monedas"
            )
        }
    }
}
