package `3_Estructura_condicional_if`

fun main() {
    print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese l segundo valor: ")
    val valor2 = readln().toInt()
    if (valor1 < valor2) {
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        print ("la suma de los valores es: $suma")
        print("la resta de los valores es: $resta")
    }else {
        val producto = valor1 * valor2
        val divicion = valor1 / valor2
        println("el producto de los valoeres es $producto")
        println("el valor de la divicion es $divicion")
    }
}