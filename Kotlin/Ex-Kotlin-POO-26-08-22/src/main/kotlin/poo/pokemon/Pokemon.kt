package poo.pokemon

abstract class Pokemon(
    val nome: String,
    val sexo: String,
    val tipo: String,
    var vida: Int,
    var forca: Int
    ) {



    abstract fun ataque(ataque: Int)

    abstract fun defesa()

    abstract fun exibirInfos()


}