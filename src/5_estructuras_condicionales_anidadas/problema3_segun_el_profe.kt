package `5_estructuras_condicionales_anidadas`

/*
Un postulante a un empleo, realiza un test de capacitación,
se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron
y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese
los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido,
y sabiendo que:
*/
fun main() {
    print("cuantas preguntas tuvo la prueva:")
    val preguntas = readln().toInt()
    print("cuantas conntesto respuestas correctas:")
    val respuestascorrectas = readln().toInt()
    val porcentage = (respuestascorrectas.toDouble() / preguntas.toDouble()) * 100

    val nivel = if (porcentage >= 90) {
        print("nivel maximo")
    } else {
        if (porcentage >= 75) {
            print("nivel medio")
        } else {
            if (porcentage >= 50) {
                print("nivel regular")
            } else {
                print("el nivel no es el requerido para el postulante")
            }
        }
    }
}
