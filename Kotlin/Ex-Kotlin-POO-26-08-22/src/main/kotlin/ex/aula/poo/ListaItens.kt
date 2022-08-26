package ex.aula.poo

object ListaItens {

    private var _listaItens = mutableListOf<String>()
    var listaItens = _listaItens

    fun adcItem(item: String){
        if(item.isNotBlank()){
            _listaItens.add(item)
        }
    }
    fun removerItens (item: String){
        if(_listaItens.contains(item)){
            _listaItens.remove(item)
        }else{
            println("Item não encontrado.")
        }
    }
    fun listarItens (){
        _listaItens.forEach {
            println(it)
        }
    }
    fun alterarItem(item: String){
        if(_listaItens.contains(item)){
            val pos = _listaItens.indexOf(item)
            print("Item alterado com sucesso.")
            _listaItens[pos] = readln()
        }
    }


}