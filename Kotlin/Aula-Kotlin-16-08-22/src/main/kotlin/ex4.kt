import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    /*
    *4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
      número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
      ímpar exiba o número elevado ao quadrado.
    * */


    print("Informe um número: ")
    val num = readln().toInt()

    if(num % 2 == 0){
        val raizQuad = sqrt(num.toFloat())
        println("Número $num é par e a raiz quadrada dele é $raizQuad")
    }else{
        val elevadoQuad = num.toFloat().pow(2)
        println("Número $num é ímpar e elevado ao quadrado fica $elevadoQuad")
    }
}