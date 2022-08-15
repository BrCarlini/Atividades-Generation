/**
 * Exercícios com Vetores[  ]
 *
2 -Um dado é lançado 10 vezes e o valor correspondente é anotado.
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
A seguir determine e imprima a média aritmética dos lançamentos,
contabilize e apresente também quantas foram as ocorrências da maior pontuação.

 */

import kotlin.random.Random


fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

fun main() {
    val start = 1
    val end = 6
    val valores = IntArray(10)

    // Gera os valores aleatorios
    for (i in 0..9){
        //println(rand(start, end))
        valores[i] = rand(start, end)
    }


    var somaValores = 0.0f
    var valorMaior = 0
    var cont = 0


    print("Todos os valores ----> ")
    // Imprime, soma todos os valores e verifica o maior e o contabiliza
    for(i in 0..9){

        // Imprime todos os valores
        print("${valores[i]}/ ")

        // Soma todas os dados
        somaValores += valores[i]

        // Verifica o maior
        if(valores[i] > valorMaior){
            valorMaior = valores[i]
            cont++
        }

    }

    println("\n==========================================================")

    // Gera a media da soma entre todos os valores
    val media: Float = somaValores / 10

    // Imprime os resultados
    println("A soma de todos os números è: $somaValores")
    println("Média: $media")
    println("O maior número foi alterador: $cont vezes")

}