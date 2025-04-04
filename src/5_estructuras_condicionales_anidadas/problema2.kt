package `5_estructuras_condicionales_anidadas`

/*
Confeccionar un programa que permita cargar un número entero positivo de hasta tres
 cifras y muestre un mensaje indicando si
 tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
 */
fun main() {
    print("ingrese un numero de una a tres sifras: ")
    val num = readln().toInt()
    if (num <= 9){
        print("el numero digitado es de una sola sifra")
    }else{if (num <= 99)
        print("el numero digitado tiene dos sifras ")
        else{
            print ("el numero digitado es de tres sifras")
        if (num >= 1000){
            print("error el numero digitado es de mas de tres sifras")
        }
    }
    }
}