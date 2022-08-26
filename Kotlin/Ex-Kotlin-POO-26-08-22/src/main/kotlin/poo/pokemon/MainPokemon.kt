package poo.pokemon

fun main() {

    print("Nome do Pokemon: ")
    val nome = readln()

    print("Sexo: ")
    val sexo = readln()

    print("Tipo: ")
    val tipo = readln()

    print("Vida: ")
    val vida = readln().toInt()

    print("Força: ")
    val forca = readln().toInt()


    val pokeAtacante = TipoFogo(nome, sexo, tipo, vida, forca)

    val pokeDefensor = TipoFogo(
        "Montres",
        "Femea",
        "Fogo",
        555,
        450
    )

    println("==== Antes do Ataque ====")
    pokeDefensor.exibirInfos()

    println()
    pokeDefensor.ataque(pokeAtacante.forca)
    //println("${pokeDefensor.nome} -> Vida ${pokeDefensor.vida}")
    println()

    println("==== Depois do Ataque ====")
    pokeDefensor.exibirInfos()


}