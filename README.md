# Prueba Técnica ProTiempo

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
     * El OutlinedTextField: Se encarga de ingresar el monto que desee el usuario. 
     * Retirar: Este Boton convertira ese valor en el menor nos mostrara la menor cantidad de monedas posibles que fueron retiradas. 
   - En caso de que haya ocurrido un error o se valide una cantidad de monedas que no se pueda retirar, este mostrará un mensaje. 
  
9. Integración de librerías externas.
   - Navigation Compose: Se implementó para poder navegar entre pantallas de tipo Compose.
   - ViewModel: Implementada para crear la clase de tipo ViewModel y que esta controle la lógica de la pantalla y persista sus datos.
   - Hilt: Utilizada para implementar la inyección de dependencias en el proyecto.
