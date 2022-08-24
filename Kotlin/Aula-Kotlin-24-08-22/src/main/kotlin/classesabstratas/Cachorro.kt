package classesabstratas

class Cachorro(especie: String,
               nomeCientifico: String,
               habitat: String,
               carnivoro: Boolean,
               sexo: String,
               idade: Int,
               val nome: String
): Animal(especie, nomeCientifico, habitat, carnivoro, sexo, idade
) {
    override fun correr() {
        println("Correndo como um dog")
    }

    override fun dormir() {
        println("Dormir como um dog")
    }

    override fun andar() {
        println("Andar como um dog")
    }

    override fun comer() {
        println("Comer como dog")
    }

    override fun emitirSom() {
        println("Latir")
    }
}