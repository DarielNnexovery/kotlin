package `5_estructuras_condicionales_anidadas`

/*
Un postulante a un empleo, realiza un test de capacitación,
 se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron
  y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese
   los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido,
    y sabiendo que:
 */
fun main(){
    print("cuanto porcentage saco en la prueva:")
    val nota = readln().toInt()
    val res = if (nota>=90) " de nivel maximo"
    else if (nota>=75) " de nivel medio"
    else if (nota>=50) " de nivel regular"
    else "ta fuera del nivel requerido"

    print("el postulante es$res")

    }