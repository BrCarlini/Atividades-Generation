val convidados = mutableListOf<String>()

//Exemplo interagindo com o usuário
fun addConvidade(nome: String){
    if(nome != ""){
        convidados.add(nome)
        println("Nome $nome adicionado com sucesso!")
    }else{
        println("Valor Inválido")
    }
}

fun removeConvidade(){
    //Remove - collection.remove()
    while (true){
        println("Agora digite alguém para ser excluído da lista: ")
        val nome = readln()

        //contains - Vai verificar se a lista contém um determinado valor
        if(convidados.contains(nome)){
            convidados.remove(nome)
            println("Convidado $nome excluído com sucesso")
            break
        }else{
            println("O Convidado $nome não existe na lista")
        }
    }
}

fun updateConvidade(){
    println("Digite um nome de um convidado que deseja atualizar: ")
    val nome = readln()

    if(convidados.contains(nome)){
        val posicao = convidados.indexOf(nome)
        println("Digite o novo nome do convidado: ")
        convidados[posicao] = readln()
        println("Convidado atualizado com sucesso!")
    }else{
        println("O convidade $nome não existe na lista")
    }
}

fun getConvidades(){
    println()
    println(convidados)
}