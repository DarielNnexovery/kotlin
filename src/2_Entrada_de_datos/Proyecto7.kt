package `2_Entrada_de_datos`

/*
Se debe desarrollar un programa que pida el ingreso del precio
 de un artículo y la cantidad que lleva el cliente. Mostrar
  lo que debe abonar el comprador.
 */

fun main() {
    print("ingrese el precio del producto: ")
    val precio: Double = readln().toDouble()
    print("ingrese la cantidad de productos:")
    val cantidad: Int = readln().toInt()
    val total: Double = precio * cantidad
    println("el total a pagar es $total")
}