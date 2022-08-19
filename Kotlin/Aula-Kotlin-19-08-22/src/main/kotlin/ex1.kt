
fun main() {
    /*
    * Crie um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list
    * */

    while(true){
        println("Menu:\n1 - Adicionar Item\n2 - Remover Item\n3 - Atualizar Item\n4 - Mostrar Itens Adicionados\n5 - Sair")
        print(">>> ")
        val opcao = readln().toInt()

        when(opcao){
            1 -> adcItem()
            2 -> rvItem()
            3 -> atualizar()
            4 -> exibirItem()
            5 -> break
        }
    }


}




