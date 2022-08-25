package ex1

class Cachorro(
    nome: String,
    idade: Int
): Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Cachorro")
    }

    override fun correr() {
        super.correr()
        println("Cachorro")
    }
}