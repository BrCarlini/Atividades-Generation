/**
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */

fun main() {
    val matrizA = Array(3){IntArray(3)}
    var soma = 0

    for(i in 0..2){
        for(j in 0 .. 2){
            print("Informe um número: ")
            val inserir = readln().toInt()
            matrizA[i][j] = inserir

            soma += matrizA[i][j]
        }
    }

    println("Matriz: ")
    for(i in 0..2){
        for(j in 0..2){
            if(j < 2){
                print("${matrizA[i][j]} ")
            }else{
                println("${matrizA[i][j]}")
            }
        }
    }

    val somaDiagonal = matrizA[0][0] + matrizA[1][1] + matrizA[2][2]

    println("A soma entre todos os valores: $soma")
    println("A soma entre os valores da diagonal: $somaDiagonal")

}