class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
){

    //Atributos que controlam a lista de compras
    private val _listaCompras = mutableListOf<String>()
    val listaCompras: List<String> = _listaCompras

    init {
        checarDados()
    }

    fun addCompra(compra: String){
        if(compra.isNotBlank()){
            _listaCompras.add(compra)
            println("Produto adicionado com sucesso!")
        }else{
            println("Produto Inválido")
        }
    }

    fun removeCompra(compra: String){
        if(_listaCompras.contains(compra)){
            _listaCompras.remove(compra)
            println("Produto removido com sucesso!")
        }else{
            println("O produto $compra não existe na lista!")
        }
    }

    fun exibirCompras(){
        println("***Lista de Compras***\n")
        _listaCompras.forEach {
            println(it)
        }
    }

    private fun checarDados(){
        if(nome.isBlank()){
            throw Exception("Cadastro feito de maneira incorreta!")
        }
    }

}