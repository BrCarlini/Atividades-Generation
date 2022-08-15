/**
 * Exercícios com Vetores[  ]
1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
Encontre após a maior pontuação e a apresente.
 */

fun main() {
    val notas = FloatArray(5)

    // Adiciona os valores no vetor
    for(i in 0 .. 4){
        print("Informe um valor: ")
        notas[i] = readLine()!!.toFloat()
    }


    // Imprime todas as notas
    print("Todas as notas ---> ")
    for(i in 0 .. 4){
        print("${notas[i]}/ ")
    }


    var maiorNota = notas[0]

    // Verifica a maior nota
    for(i in 0 .. 4){
        if(notas[i] > maiorNota){
            maiorNota = notas[i]
        }
    }


    println("\nA maior nota é $maiorNota.")


}