fun main(){

    /*
    List - É um tipo que armazena diversos valores, com um tamanho variado
    List Imutável - Lista onde não poderemos alterar os valores e nem o tamanho
    List Mutável - Lista onde poderemos alterar todos os valores e o tamanho
     */

    //List Imutável
    //val nomes = listOf("Jeremias", "Gilda", "Gilberto")

    //List Mutável
    // val convidados = mutableListOf<String>()


    /*
    //Exemplo simples
    convidados.add("Michell")
    println(convidados)
    println("Tamanho da List: ${convidados.size}")
    convidados.add("Thays")
    convidados.add("Caroline")
    convidados.add("Giovanni")
    println()
    println(convidados)
    println("Tamanho da List: ${convidados.size}")
     */
    while (true){
        println()
        println("1 - Adicionar Convidades")
        println("2 - Remover Convidades")
        println("3 - Atualizar Convidades")
        println("4 - Exibir Convidades")
        println("5 - Sair")
        println()
        println("Opção: ")
        when(readln().toInt()){
            1 -> {
                println("Digite um nome: ")
                val nome = readln()
                addConvidade(nome)
            }
            2 -> removeConvidade()
            3 -> updateConvidade()
            4 -> getConvidades()
            5 -> break
            else -> println("Opção Inválida")
        }
    }



}