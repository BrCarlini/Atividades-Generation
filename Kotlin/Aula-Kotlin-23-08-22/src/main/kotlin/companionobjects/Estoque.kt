package companionobjects

object Estoque {
     val listaProdutos = mutableListOf<String>()

    fun addProdutos(produto:String){
        listaProdutos.add(produto)
    }

    fun exibirProduto(){
        listaProdutos.forEach {
            println(it)
        }
    }
}