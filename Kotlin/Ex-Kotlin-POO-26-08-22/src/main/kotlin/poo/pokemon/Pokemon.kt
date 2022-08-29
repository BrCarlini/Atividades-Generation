package poo.pokemon

abstract class Pokemon(
    val nome: String,
    val sexo: String,
    val tipo: String,
    var vida: Double
    ) {



    open fun ataque(ataque: Double, oponente: Pokemon){
        if(ataque > 0){
            println("$nome atacadou ${oponente.nome}.")
        }else{
            println("Falha no ataque")
        }
    }

    open fun defesa(oponente: Pokemon){
        
    }

    fun exibirInfos() {
        println("Nome: $nome\nSexo: $sexo\nTipo: $tipo\nVida: $vida")
    }


}