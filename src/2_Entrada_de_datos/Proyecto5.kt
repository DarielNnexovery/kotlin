package `2_Entrada_de_datos`

fun main(argumento: Array<String>) {
    print("Ingrese el primer valor : ")
    val valor1 = readln().toInt()
    print("Ingrese el degundo valor : ")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 * $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")

}