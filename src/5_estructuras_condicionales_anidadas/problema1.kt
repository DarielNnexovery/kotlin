package `5_estructuras_condicionales_anidadas`

/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo(cero) o negativo.

 */
fun main(){
    print("ingrese un numero cualquiera:")
    val num = readln().toInt()
    if (num > 0)
        print("el numero $num es positivo")
    else if (num < 0)
        print("el numero $num es negativo")
    else print ("el numero es nulo")
    }

