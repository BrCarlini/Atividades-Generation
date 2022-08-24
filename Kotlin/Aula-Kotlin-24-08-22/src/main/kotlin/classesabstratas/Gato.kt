package classesabstratas

class Gato(especie: String,
           nomeCientifico: String,
           habitat: String,
           carnivoro: Boolean,
           sexo: String,
           idade: Int,
           val nome: String
) : Animal(especie, nomeCientifico, habitat, carnivoro, sexo, idade) {


    override fun correr() {
        println("Correr como gato")
    }

    override fun dormir() {
        println("Dormir como gato")
    }

    override fun andar() {
        println("Andar como gato")
    }

    override fun comer() {
        println("Comer como gato")
    }

    override fun emitirSom() {
        println("Miar")
    }

    fun ronronar(){
        println("Ronronando como gato")
    }
}