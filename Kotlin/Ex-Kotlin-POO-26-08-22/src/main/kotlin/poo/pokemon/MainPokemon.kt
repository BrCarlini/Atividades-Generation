package poo.pokemon

fun main() {

    /*
    print("Nome do Pokemon: ")
    val nome = readln()

    print("Sexo: ")
    val sexo = readln()

    print("Tipo: ")
    val tipo = readln()

    print("Vida: ")
    val vida = readln().toDouble()

    print("Ataque: ")
    val ataque = readln().toDouble()
*/

    val pokeAtacante = TipoFogo(
        "Charizard",
        "Macho",
        "Fogo",
        500.0
    )

    val pokeDefensor = TipoPlanta(
        "Articulo",
        "Femea",
        "Fogo",
        500.0
    )

    pokeAtacante.ataque(200.0, pokeDefensor)
    println(pokeAtacante.vida)
    println("Vida do Defensor: ${pokeDefensor.vida}")



}