package com.example.pruebatecnicaprotiempo

import CAJERO_SCREEN
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pruebatecnicaprotiempo.cajero.ui.view.CajeroScreen
import com.example.pruebatecnicaprotiempo.cajero.ui.viewModel.CajeroViewModel
import com.example.pruebatecnicaprotiempo.core.theme.PruebaTecnicaProTiempoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            PruebaTecnicaProTiempoTheme {
                val cajeroViewModel: CajeroViewModel by viewModels()
                val navigationController = rememberNavController()
                NavHost(navigationController, startDestination = CAJERO_SCREEN ){
                    composable(CAJERO_SCREEN){
                        CajeroScreen(
                            cajeroViewModel = cajeroViewModel
                        )

                    }
                }
            }
        }
    }
}
