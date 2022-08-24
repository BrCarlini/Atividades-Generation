package ex3/*
3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */

class ProdutoEletronico(
    val nome: String,
    val serie: String,
    val anoFabri: String
) {
    var depart = ""
    constructor(
        nome: String,
        serie: String,
        anoFabri: String,
        depart: String
    ): this(nome, serie, anoFabri){
        this.depart = depart
    }

    fun botaoPower(botao: String){
        if (botao == "1"){
            println("Eletrônico Ligando")
            exibirInfos()
        }else{
            println("Eletrônico Desligado")
        }
    }

    fun exibirInfos(){
        println("$nome - $anoFabri")
        println("=======================================")
        println(serie)
        println("=======================================")
    }
}