import ex1.Cachorro
import ex1.Cavalo
import ex1.Preguica

fun main() {

    print("Informe o nome do Cachorro: ")
    val nomeDog = readln()

    print("Informe a idade do Cachorro: ")
    val idadeDog = readln().toInt()
    val cachorro1 = Cachorro(nomeDog, idadeDog)



    print("Informe o nome do Cavalo: ")
    val nomehorse = readln()

    print("Informe a idade do Cavalo: ")
    val idadeHorse = readln().toInt()
    val cavalo1 = Cavalo(nomehorse, idadeHorse)


    print("Informe o nome do Preguiça: ")
    val nomePregui = readln()

    print("Informe a idade do Preguiça: ")
    val idadePregui = readln().toInt()
    val preguica1 = Preguica("Bixo Preguiça", 7)



    println("=========================================================")

    cachorro1.exibirInfos(nomeDog, idadeDog)
    cachorro1.correr()
    cachorro1.emitirSom()

    println("=========================================================")

    cavalo1.exibirInfos(nomehorse, idadeHorse)
    cavalo1.correr()
    cavalo1.emitirSom()

    println("=========================================================")

    preguica1.exibirInfos(nomePregui, idadePregui)
    preguica1.emitirSom()
    preguica1.subirEmArvores()


}