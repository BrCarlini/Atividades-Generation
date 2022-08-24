package ex1
/*
1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
 */


class Cliente(val nome: String, val endereco: String, val telefone: String) {



    init {
        verificarNome()
    }

    private fun verificarNome(){
        if (nome == ""){
            throw Exception("Nome Inválido.")
        }
    }

    companion object{
        private var listaDeCompras = mutableListOf<String>()
        fun addItem(item: String){
            if(item.isNotBlank()){
                listaDeCompras.add(item)
                println("Item adicionado com sucesso!")
            }
        }

        fun removeItem(item: String){
            if(listaDeCompras.contains(item)){
                listaDeCompras.remove(item)
                println("Item removido com sucesso")
            }
        }

        fun exibirItem(){
            println("========= ITENS =========")
            listaDeCompras.forEach {
                println(it)
            }
            println("========================")
        }
    }




}