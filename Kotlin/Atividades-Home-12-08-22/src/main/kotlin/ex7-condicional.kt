/*
7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
*/

fun main() {

    val area: Float

    print("Digite a base do triângulo: ")
    val base = readLine()!!.toFloat()

    print("Digite a altura do triângulo: ")
    val altura = readLine()!!.toFloat()

    if(base > 0 && altura > 0){


        area = (base * altura) / 2

        println("A área deste triângulo é: $area")


    }else{
        println("Calculo impossível de ser realizado!")
    }


}