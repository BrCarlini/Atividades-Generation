/*

	Outono : De 21 de março a 21 de junho.
	Inverno: De 21 de junho a 23 de setembro.
	Primavera: De 23 de setembro a 21 de dezembro.
	Verão: De 21 de dezembro a 21 de março.

*/

fun main() {


    val estacao = arrayOf("Outono : De 21 de março a 21 de junho.", "Inverno: De 21 de junho a 23 de setembro.", "Primavera: De 23 de setembro a 21 de dezembro.", "Verão: De 21 de dezembro a 21 de março.")


    print("Escolha uma estação do ano:\n[1]-Outono   [2]-Inverno\n[3]-Primavera   [4]-Verão\n>>> ")
    val menu = readLine()!!.toInt()

    when(menu){

        1 -> println(estacao[0])
        2 -> println(estacao[1])
        3 -> println(estacao[2])
        4 -> println(estacao[3])
        else -> {
            println("Opção inválida")
        }
    }



}
