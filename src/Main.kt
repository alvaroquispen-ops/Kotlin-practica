import java.util.Scanner

// Clase con estado (saldo) y métodos que lo modifican
class CuentaBancaria(val titular: String, var saldo: Double) {

    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
            println("Depósito exitoso. Nuevo saldo: S/ $saldo")
        } else {
            println("El monto debe ser mayor a 0.")
        }
    }

    fun retirar(monto: Double) {
        if (monto <= 0) {
            println("El monto debe ser mayor a 0.")
        } else if (monto > saldo) {
            println("Saldo insuficiente. Tu saldo es S/ $saldo")
        } else {
            saldo -= monto
            println("Retiro exitoso. Nuevo saldo: S/ $saldo")
        }
    }

    fun mostrarSaldo() {
        println("Titular: $titular | Saldo actual: S/ $saldo")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val cuenta = CuentaBancaria("Juan Pérez", 100.0)

    var opcion = -1

    while (opcion != 4) {
        println("\n--- BANCO ---")
        println("1. Ver saldo")
        println("2. Depositar")
        println("3. Retirar")
        println("4. Salir")
        print("Elige una opción: ")
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> cuenta.mostrarSaldo()
            2 -> {
                print("Monto a depositar: ")
                cuenta.depositar(scanner.nextDouble())
            }
            3 -> {
                print("Monto a retirar: ")
                cuenta.retirar(scanner.nextDouble())
            }
            4 -> println("Gracias por usar el banco. ¡Hasta pronto!")
            else -> println("Opción no válida.")
        }
    }
}