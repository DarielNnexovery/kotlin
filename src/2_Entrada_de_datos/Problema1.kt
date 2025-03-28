package `2_Entrada_de_datos`

/*
Escribir un programa en el cual se ingresan cuatro números enteros,
 calcular e informar la suma de los dos primeros
 y el producto del tercero y el cuarto.
 */
fun main() {
    print("Ingrese el primer numero : ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo numero : ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer numero : ")
    val valor3 = readln().toInt()
    print("Ingrese el cuarto numero : ")
    val valor4 = readln().toInt()
    val suma: Int = valor1 + valor2
    println("el valor de la suma de los dos primeros numeros es de $suma")
    val producto : Int = valor3 * valor4
    println("el valor de el producto de los numeros 3 y 4 es $producto")



}