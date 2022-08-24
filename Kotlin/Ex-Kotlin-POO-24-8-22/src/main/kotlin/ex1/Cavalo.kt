package ex1

class Cavalo(
    nome: String,
    idade: Int
): Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Cavalo")
    }

    override fun correr() {
        super.correr()
        println("Cavalo")
    }
}