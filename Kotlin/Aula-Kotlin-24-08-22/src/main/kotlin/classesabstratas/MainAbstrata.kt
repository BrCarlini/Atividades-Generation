package classesabstratas

fun main() {
    /*
    Classes Abstrats: Classe pai que não poderá ser instanciada,
    só as classes filhas que conseguirão criar outros objetos.


    Animal (Pai ou superclasse)
        Cachorro
        Gato
     */

    val cachorro = Cachorro("canino", "dogis-dogo", "casa", true, "macho", 12,
        "Toto")

    cachorro.andar()
    cachorro.comer()
    cachorro.correr()
    cachorro.dormir()
    cachorro.emitirSom()

    println("============================================")

    val gato = Gato("felino", "gatuno-brabo", "casa", true, "macho", 12,
        "Toto")

    gato.andar()
    gato.comer()
    gato.correr()
    gato.dormir()
    gato.emitirSom()
    gato.ronronar()
}