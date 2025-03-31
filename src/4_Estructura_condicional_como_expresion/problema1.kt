package `4_Estructura_condicional_como_expresion`

import kotlin.math.sqrt

/* Solicita al usuario ingresar dos números enteros
 (pueden ser negativos). Luego, determina cuál de los dos
 tiene mayor valor absoluto y muestra ese número en pantalla.
 */
fun main(){
    print("Ingrese el primer valor ya sea positivo o negativo :")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor ya sea positivo o negativo")
    val valor2 = readln().toInt()
    val num1 = Math.sqrt((valor1 * valor1).toDouble())
    val num2 = Math.sqrt((valor2 * valor2).toDouble())
    val valorap = if (num1 > num2) num1 else num2

    println("el valor apsoluto sera el numero que mas se alejo del sero y ese es $valorap")



}
