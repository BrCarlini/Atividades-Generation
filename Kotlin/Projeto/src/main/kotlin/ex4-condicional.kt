/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.

*/

fun main() {
    print("Informe um número: ")
    val num = readLine()!!.toInt()


    if(num % 2 == 0){
        println("O número $num é par.")
    }else{
        println("O número $num é ímpar.")
    }



    if(num < 0){
        println(" -> Número informado é Negativo.")
    }else{
        println(" -> Número informado é Positivo")
    }


}