package ex.aula.poo

open class Doador(

    nome: String,
    cpf: String,
    endereco: String,
    email: String,
    idade: Int

): Pessoa(

    nome, cpf, endereco, email, idade

) {
    init {
        checarDados()
    }

    var historicoDoador = mutableListOf<String>()

    fun doacao (xxx: String){
        ListaItens.adcItem(xxx)
        historicoDoador.add(xxx)
    }
    fun exibirLista (){
        ListaItens.listarItens()

    }
    fun alterarItens (item: String){
        ListaItens.alterarItem(item)
    }
    fun checarDados(){
        if(nome == "" || cpf.length != 11){
            throw Exception("Cadastro feito de maneira errada")
        }
    }
    fun exibirHistoticoD (){
        historicoDoador.forEach{
            println(it)
        }

    }




}