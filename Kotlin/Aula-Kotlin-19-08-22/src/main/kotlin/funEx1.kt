val itens = mutableListOf<String>()


// Adicionar Itens
fun adcItem(){
    print("Informe o nome do Item a ser adicionado: ")
    val nomeItem = readln()

    if(nomeItem != ""){
        itens.add(nomeItem)
        println("Item $nomeItem, foi adicionado com Sucesso.")
    }else{
        println("Valor Inválido.")
    }
    println("===========================================")
}


// Remover Itens
fun rvItem(){
    print("Informe o Item a ser removido: ")
    val nomeItem = readln()

    if(itens.contains(nomeItem)){
        itens.remove(nomeItem)
        println("Item $nomeItem, foi removido com Sucesso.")
    }else{
        println("Valor Inválido.")
    }
    println("===========================================")
}


// Atualizar
fun atualizar(){
    exibirItem() // Exibe a lista atual para o usuario se lembrar quis itens estão presentes
    print("Informe o item a ser atualizado: ")
    val nomeItem = readln()

    if(itens.contains(nomeItem)){
        val index = itens.indexOf(nomeItem)  // Verifica se o valor passado em () esta na lista
        print("Digite o novo item: ")
        itens[index] = readln()
        println("Item atualizado com Sucesso.")
    }
    println("===========================================")
}


// Exibir Itens
fun exibirItem(){
    println("===========================================")
    println("================== ITENS ==================")
    println("===========================================")
    for(i in itens){
        println("Item ---> $i")
        println("===========================================")
    }
}