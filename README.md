# Prueba Técnica Interrapidisimo 

A continuación voy a explicar cómo desarrollé cada uno de los puntos solicitados en la Prueba Técnica de ProTiempo y cada una de las librerías o componentes que se usaron para cumplir con el reto.

Author: George Sebastian Melo Mendivelso.

# Tecnologias Utilizadas 

- Kotlin.
- Jetpack Compose.
- hilt.
- Navigation Compose.

# Instrucciones para ejecutar la aplicación

1. Clonar el repositorio: git clone https://github.com/GeorgeSMelo/PruebaTecnicaProTiempo
2. Abrir el proyecto en Android Studio.
3. Ejecutar la aplicación desde Android Studio.

1. Pantalla principal - CajeroScreen
   - Toda la pantalla principal LoginScreen se desarrolló con Jetpack Compose.
   - Muestra la información de cuantas monedas se retiran y con el menor numero de monedas que este necesite.
   - Se agregaron 1 botones y 1 OutlinedTextField:
     * Validar versión: Valida la versión local con la versión remota del endpoint. 
     * Login: Redirige al HomeScreen. 
   - En caso de que haya ocurrido un error o se valide una cantidad de monedas que no se pueda retirar, este mostrará un mensaje. 
  
9. Integración de librerías externas.
   - Navigation Compose: Se implementó para poder navegar entre pantallas de tipo Compose.
   - ViewModel: Implementada para crear la clase de tipo ViewModel y que esta controle la lógica de la pantalla y persista sus datos.
   - Hilt: Utilizada para implementar la inyección de dependencias en el proyecto.
