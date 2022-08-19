fun main() {
    /*
    * Map (ou dicionario) - Trabalho com chave e valor (por exemplo o código do funcionário
    * e o funcionario em si, ou seja, algo parecido com 500 = Henrique)
    *
    * Pair<K, V>
    *
    * Pair<Int, String>
    *
    * Map Mutável
    * Map Imutável
    *
    * */

    val funcionarios = mutableMapOf<Int, String>(
        123 to "Bruno",
        321 to "Joana Darc",
        456 to "Carlos"
    )

    funcionarios.forEach{
        println("Código: ${it.key}\nNome: ${it.value}")
        println("============================")
    }

    print("Informe o nome do funcionário: ")
    val nome = readln()

    while(true){
        val cod = (1..500).random()
        if (funcionarios.containsKey(cod)){
            println("Chave já cadastrada")
        }else{
            funcionarios[cod] = nome
            break
        }
    }

    funcionarios.forEach{ (k, v) ->
        println("Código: $k\nNome: $v")
        println("============================")
    }
}