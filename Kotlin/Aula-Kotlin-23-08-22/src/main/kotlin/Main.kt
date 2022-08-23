import companionobjects.Calculadora
import companionobjects.Estoque
import encap.Estudante

fun main(args: Array<String>) {
    /*
    Companion Object - Atributos e métodos sem precisar instaciar uma classe;

    Objetos Anônimos - São objetos que só são instaciados uma única vez

    Encapsulamento - Deixar os nossos dados protegidos

    Exceção - Soltar exceções personalizadas e tratar essas exceções
     */

    println(Calculadora.soma(5.0, 3.0))

    Estoque.addProdutos("Arroz")
    Estoque.addProdutos("Feijão")
    Estoque.addProdutos("Bife")

    Estoque.exibirProduto()


    /*
    Tratamento de Erros:

    Try...Catch

    try{
        Bloco que o programa tentará executar

    }catch(armazenar o erro em uma variavel){

        Tratar o erro capturando

    }
     */

/*
    while (true){
        try {
            val num = readln().toInt()
            break
        }catch (e: Exception){
            println("Houve um erro digitando o número.")
        }
    }
    */

    /*
    Jogar exceções no programa

    throw Exception(mensagem do erro)
     */

    //throw Exception("O codigo deu erro pq sim")

    val estudante1 = Estudante("", "34563")
}