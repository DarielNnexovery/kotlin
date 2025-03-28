package `3_Estructura_condicional_if`

/*
Se ingresa por teclado un número entero comprendido
 entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */
fun main() {
    print("ingrese unnumero entre el numero 1 y 99: ")
    val num = readln().toInt()
    if (num <= 9){
    print("el numero digitado es de un solo digito")
    }else{
        print("el numero digitado tiene dos digitos")
    }
}