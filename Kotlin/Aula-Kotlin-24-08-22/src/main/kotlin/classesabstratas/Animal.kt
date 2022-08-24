package classesabstratas

// abstract - ser aberta, porem não podera criar instancia direto da class Animal

abstract class Animal(
    val especie: String,
    val nomeCientifico: String,
    val habitat: String,
    val carnivoro: Boolean,
    val sexo: String,
    val idade: Int
        ){

    abstract fun correr()

    abstract fun dormir()

    abstract fun andar()

    abstract fun comer()

    abstract fun emitirSom()



}