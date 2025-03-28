package `3_Estructura_condicional_if`

fun main() {
    print("Ingrese el primer valor : ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor : ")
    val valor2 = readln().toInt()
    if (valor1 > valor2)
        print("el mayor valor es $valor1")
    else
        print("el mayor valor es $valor2")
}