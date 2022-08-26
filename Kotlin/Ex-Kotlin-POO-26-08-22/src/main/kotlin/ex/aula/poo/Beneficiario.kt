package ex.aula.poo

open class Beneficiario(

    nome: String,
    cpf: String,
    endereco: String,
    email: String,
    idade: Int

) : Pessoa(

    nome, cpf, endereco, email, idade

) {
    init {
        checarDados()
    }

    var historicoB = mutableListOf<String>()

    fun receber(xxx: String) {
        ListaItens.removerItens(xxx)
        historicoB.add(xxx)
    }

    fun exibirLista() {
        ListaItens.listarItens()
    }
    fun checarDados(){
        if(nome == "" || cpf.length != 11){
            throw Exception("Cadastro feito de maneira errada")
        }
    }
    fun exibirHistoricoB (){
        historicoB.forEach{
            println(it)
        }

    }




}