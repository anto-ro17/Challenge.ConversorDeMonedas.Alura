# Challenge conversor de monedas

Este es un sencillo programa de conversión de divisas que permite convertir entre varias monedas usando una API para obtener las tasas de cambio actuales.

## Monedas Disponibles

El programa puede convertir entre las siguientes monedas:

- ARS - Peso argentino
- BOB - Bolivar boliviano
- BRL - Real brasileño
- CLP - Peso chileno
- COP - Peso colombiano
- USD - Dólar estadounidense
- MXN - Peso Mexicano

## Tecnologías Usadas

- **Java**: Lenguaje de programación.
- **Gson**: Biblioteca para parsear JSON.
- **HttpClient**: Clase para manejar solicitudes HTTP.
- **HttpRequest**: Clase para crear solicitudes HTTP.
- **HttpResponse**: Clase para manejar respuestas HTTP.

## Requisitos Previos

Antes de ejecutar el programa, asegúrate de tener lo siguiente:

- Java JDK 11 o superior.
- Tu propia clave de API de ExchangeRate-API.

## Uso del Programa

El programa mostrará un menú en la consola con las monedas disponibles. Sigue estos pasos:

1. Selecciona la moneda de origen ingresando el número correspondiente.
2. Selecciona la moneda de destino ingresando el número correspondiente.
3. Ingresa la cantidad que deseas convertir.

El programa mostrará la cantidad convertida en la moneda de destino.

## Ejemplo

=== Menú de Conversión de Divisas ===

1.ARS - Peso argentino
2.BOB - Bolivar boliviano
3.BRL - Real brasileño
4.CLP - Peso chileno
5.COP - Peso colombiano
6.USD - Dólar estadounidense
7.MXN - Peso Mexicano
8.Salir
Selecciona la divisa de origen (número): 1
Selecciona la divisa de destino (número): 6
Ingresa la cantidad a convertir: 1000
1000.00 ARS es igual a 10.00 USD


## Problemas Conocidos

- Asegúrate de que la clave de la API es válida y de que tienes conexión a Internet.
- Si el programa no puede obtener las tasas de cambio, mostrará un mensaje de error.

## Contribuciones

Si quieres mejorar este proyecto, ¡las contribuciones son bienvenidas! Puedes hacer un fork del repositorio, hacer tus cambios y luego enviar un pull request.
