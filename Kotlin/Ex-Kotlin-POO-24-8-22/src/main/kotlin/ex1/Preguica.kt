package ex1

class Preguica(nome: String,
               idade: Int
) : Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Preguiça")
    }

    fun subirEmArvores() {

        println("Subindo em arvores como Bixo Preguiça")
    }
}