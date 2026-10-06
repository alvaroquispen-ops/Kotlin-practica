# 🏦 Cuenta Bancaria en Consola - Kotlin

Programa de consola desarrollado en **Kotlin** como parte de la práctica de fundamentos del lenguaje. Simula una cuenta bancaria básica con un menú interactivo.

## 📌 Descripción

El programa crea una cuenta a nombre de un titular con un saldo inicial, y permite al usuario:

- 💰 Consultar el saldo actual.
- ⬇️ Depositar dinero.
- ⬆️ Retirar dinero (validando que haya saldo suficiente).
- 🚪 Salir del programa.

El menú se repite hasta que el usuario elige la opción de salir.

## 🚀 Conceptos de Kotlin implementados

1. **Programación Orientada a Objetos:**
    * Clase `CuentaBancaria` con propiedades en el constructor principal.
    * Métodos `depositar()`, `retirar()` y `mostrarSaldo()` que encapsulan la lógica de la cuenta.
2. **Variables y mutabilidad:**
    * `val`: valores que no cambian (`titular`, `scanner`, `cuenta`).
    * `var`: valores que sí cambian (`saldo`, `opcion`).
    * Tipos de datos: `String`, `Double` e `Int`.
3. **Entrada de datos:**
    * Uso de `Scanner` con `nextInt()` y `nextDouble()` para leer datos del teclado.
4. **Estructuras de control:**
    * Bucle `while` para mantener el menú activo.
    * `when` para elegir la acción según la opción.
    * `if / else if / else` para validar los montos en depósitos y retiros.
5. **Interpolación de cadenas:**
    * Uso de `$variable` dentro de `println()` para mostrar mensajes.

## 🛠️ Requisitos previos

* JDK 17 o superior.
* IntelliJ IDEA (con soporte para Kotlin).

## 💻 Instrucciones de ejecución

1. Abre la carpeta del proyecto en IntelliJ IDEA.
2. Abre el archivo `src/Main.kt`.
3. Haz clic en el ícono verde de Run (▶) a la izquierda de `fun main()`.

## 📋 Demostración del menú

```
--- BANCO ---
1. Ver saldo
2. Depositar
3. Retirar
4. Salir
Elige una opción: 2
Monto a depositar: 50
Depósito exitoso. Nuevo saldo: S/ 150.0
```

## 👤 Autor

* Usuario: alvaroquispen-ops
* Curso: Desarrollo Móvil / Fundamentos de Kotlin