// Exercício - PARA

/**
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */

fun main() {
    val numero: Int
    var acum = 0

    for(i in 1..500){

        if(i % 2 == 1 && i % 3 == 0){
            acum += i
        }
    }

    println("A soma de todos os valores impares multiplos de 3, entre 1 e 500: $acum")
}