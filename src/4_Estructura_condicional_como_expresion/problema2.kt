package `4_Estructura_condicional_como_expresion`
/*Solicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
 */
fun main() {
    print("Ingrese su edad :")
    val edad = readln().toInt()
   val desedad = if (edad <13) {
        val resultado = "niño"
   } else {
       if (edad <=17){
           val resultado = "adolecente"
       }else{
           if (edad >= 18){
               val resultado = "adulto"

           }else{

              println("la persona es ")
           }
       }
   }
}




