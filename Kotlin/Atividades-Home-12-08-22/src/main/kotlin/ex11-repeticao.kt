// Exercício - ENQUANTO
/**
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
 */

fun main() {

    var cont = 0
    var somaTotal = 0.0f
    var media = 0.0f

    while(true){

        print("\nInforme um número: ")
        val num = readLine()!!.toInt()




        // Verifica se o numero é negativo, e para a execução caso for
        if(num < 0){
            println("Programa Encerrado")
            println("===============================")
            break
        }

        // Incremento para verificar quantos número foram lidos
        cont++

        // Acumula o total da soma entre todos os numeros lidos
        somaTotal += num


        media = somaTotal / cont


    }

    println("========== RESULTADO ==========")

    println("Total do somatório: $somaTotal")
    println("Média: $media")
    println("Total de valores lidos: $cont")
}