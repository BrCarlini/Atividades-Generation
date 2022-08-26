package poo.pokemon

class TipoFogo(
    nome: String,
    sexo: String,
    tipo: String,
    vida: Int,
    forca: Int
): Pokemon(nome, sexo, tipo, vida, forca) {

    override fun ataque(ataque: Int) {
        if(ataque > 0){
            vida -= ataque
            println("$nome Foi atacado.")
        }else{
            println("Falha no ataque")
        }
    }

    override fun defesa() {
        TODO("Not yet implemented")
    }

    override fun exibirInfos() {
        println("Nome: $nome\nSexo: $sexo\nTipo: $tipo\nVida: $vida\nForça: $forca")
    }
}