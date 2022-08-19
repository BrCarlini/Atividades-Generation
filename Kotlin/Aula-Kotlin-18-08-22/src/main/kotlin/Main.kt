fun main() {
    println("Hello World!")

    /*
    Funções - blocos de código que nós poderemos chamar em qualquer momento do nosso programa

    Funções com retorno - Funções que retornarão um valor, que pode ser armazenado em uma variável ou simplesmente
                          printados dentro de um println.

    Funções sem retorno - Funções que vão fazer algum cálculo específico ou
                          simplesmente realizar algum tipo de output.
    */



    /*
    Estrutura de uma função no Kotlin

    fun identificador (parametros): Tipo{

        Bloco de código que poderá ser chamado diversas vezes

    }
    */


    /*
    var vida = 10

    // Inimigo deu 3 de dano
    vida -= 3
    verificarVida(6)
     */

    //print("Digite o seu nome para ver ele em letras maiúsculas: ")
    //val nome = readln()

    // Chamando a função direto no println()
    //println("O seu nome em letras maiúsculas é: ${printarNomeMaiusculo(nome)}")


    //val nomeMaiusculo = printarNomeMaiusculo(nome)
    //Chamada através de uma variavel
    //println("O seu nome em letras maiúsculas é: $nomeMaiusculo")


    println("Soma entre 3 e 4: ${soma(3, 4)}")




}

// Parâmetros - Vão ser valores que obrigatoriamente teremos que passar na chamada da função
//para ela ser executada da maneira correta
/*
Função sem retorno - Não armazena valores, estaticos, prints (ex println())
Função com retorno - armazena valores, pretendo receber valores do usuario (ex readln())
*/
