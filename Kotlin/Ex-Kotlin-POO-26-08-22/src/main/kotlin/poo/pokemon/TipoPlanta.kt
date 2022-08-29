package poo.pokemon

class TipoPlanta(
    nome: String,
    sexo: String,
    tipo: String = "Planta",
    vida: Double
): Pokemon(nome, sexo, tipo, vida) {

    override fun ataque(ataque: Double, oponente: Pokemon) {
        super.ataque(ataque, oponente)
    }
}