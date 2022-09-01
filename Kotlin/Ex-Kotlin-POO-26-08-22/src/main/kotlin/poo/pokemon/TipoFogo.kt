package poo.pokemon

class TipoFogo(
    nome: String,
    sexo: String,
    tipo: String,
    vida: Double
): Pokemon(nome, sexo, tipo, vida) {

    override fun ataque(ataque: Double, oponente: Pokemon) {
        super.ataque(ataque, oponente)
        if(oponente.tipo == "Planta" || oponente.tipo == "Inseto" || oponente.tipo == "Aço" || oponente.tipo == "Gelo"){
            val ataqBonus = ((ataque * 0.60) + ataque)
            oponente.vida -= ataqBonus
            println("O Ataque foi de $ataqBonus")
        }else{
            oponente.vida -= ataque
        }
    }

    override fun defesa(oponente: Pokemon) {
        super.defesa(oponente)
        if(oponente.tipo == "Planta" || oponente.tipo == "Inseto" || oponente.tipo == "Aço" || oponente.tipo == "Gelo"){

        }

    }


}