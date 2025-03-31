package `4_Estructura_condicional_como_expresion`

/*Solicita al usuario que ingrese tres valores enteros positivos que representan
 los lados de un triángulo. Valida primero que puedan formar un triángulo
  (la suma de dos lados debe ser mayor al tercero).
 */
fun main() {


print("ingrese el primer valor: ")
val valor1 = readln().toInt()
print("ingrese el segundo valor: ")
val valor2 = readln().toInt()
print("ingrese el tercer valor: ")
val valor3 = readln().toInt()
    val suma = (valor1 + valor2)
    if (suma != valor3)
        print("el triangulo es escaleno")
    

}