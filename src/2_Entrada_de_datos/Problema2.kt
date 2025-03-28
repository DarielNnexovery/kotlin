package `2_Entrada_de_datos`

/*
Realizar un programa que lea por teclado cuatro valores numéricos enteros e informe su suma y promedio.
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
    val suma: Int = valor1 + valor2 + valor3 + valor4
    println("la suma de los valores ingresados es de $suma ")
    val promedio: Int = suma / 4
    println("el promedio de la suma de los nuemros anteriormente ingresados es de $promedio")
}