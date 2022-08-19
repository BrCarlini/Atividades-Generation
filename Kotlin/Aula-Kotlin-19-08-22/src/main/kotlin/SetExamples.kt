fun main() {
    /*
    * Set - Como a lista, ele tambem armazenará diversos valores, terá um tamanho variado,
    * porém ele ignora qualquer tipo de valor duplicado
    *
    * Set Imutável
    * Set Mutavel
    * */

    val idades = mutableSetOf(1, 1, 1, 1, 1)

    println(idades.size)

    idades.add(1)

    println(idades.size)

    val setNome = mutableSetOf("Henrique", "Henrique")

    println(setNome)
}