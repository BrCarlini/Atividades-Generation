fun main() {
    /*
    Collection - Variáveis(ou tipos) que podem armazenar mais de um valor

    Arrays
    List
    Set
    Map (ou dicionários)

    */

    /*
    *
    * Arrays - um tipo que armazena diversos valores e tem um tamanho fixo
    * */

    //Declarando Array com tamanho e dados definidos
    val nomes = arrayOf("Henrique", "Rodrigo", "Marcelo")

    //Declarando Array apenas com tamaho definido
    val convidados = Array<String>(10){""}

    val alunos = arrayOfNulls<String>(15)


    //Iterando sobre um array da forma mais complexa

    for(i in 0..2){
        println(nomes[i])
    }



    //Iterando de uma forma legal - for each
    for(i in nomes){
        println(i)
    }


    // Iterando de uma forma maaaais legal/simples
    nomes.forEach{
        println(it)
    }



}