package ex1

import ex1.Cliente.Companion.addItem
import ex1.Cliente.Companion.exibirItem
import ex1.Cliente.Companion.removeItem

fun main() {
    try {
        val cliente1 = Cliente("Bruno", "Av. XXXXXXX", "(11)XXXXX-XXXX")

        while(true){
            println("===========================================================================")
            print("Menu:\n1 - Adicionar Item\n2 - Remover\n3 - Exibir\n4 - Sair\n>>> ")
            val menu = readln().toInt()

            when(menu){
                1 -> {
                    print("Qual item deseja adicionar ? ")
                    val add = readln()
                    addItem(add)
                }
                2 -> {
                    print("Qual item deseja remover ? ")
                    val rv = readln()
                    removeItem(rv)
                }
                3 -> exibirItem()
                4 -> break
                else -> println("Opção inválida")
            }
        }

    }catch (e: Exception){
        println("Ocorreu um erro!")
    }
}