import kotlin.math.pow

fun main(args: Array<String>) {
    /*

    Operadores Relacionais

    == Igualdade
    != Diferença
    > Maior
    >= Maior igual
    < Menor
    <= Menor igual


    Operadores Lógicos

    && - ││


    Estrutura if...else

    if(condição){

        Os comandos que serão executados caso a condição seja verdadeira

    }else{

        Os comandos que serão executados caso a condição seja falsa

    }




    Estrutura composta

    if(condição){

        Os comandos que serão executados caso a condição seja verdadeira

    }else if(condição){

        Os comandos que serão executados caso a condição anterior seja falsa e se a nova
        condição for verdadeira

    }else{
        Os comandos que serão executados caso a condição seja falsa
    }

    */



/*
    val vida = readln().toInt()

    if(vida <= 0){
        println("O personagem está morto.")
    }else if(vida <= 5){
        println("O personagem está morrendo.")
    }else if(vida <= 7){
        println("O personagem está bem.")
    }else{
        println("O pesonagem está ótimo.")
    }
 */


    /*
    // Exemplo de calculadora de IMC

    print("Digite o seu peso: ")
    val peso = readln().toDouble()

    print("Digite a sua altura: ")
    val altura = readln().toDouble()

    val imc = peso / altura.pow(2)

    println("IMC: ${"%.2f".format(imc)}")

    println()

    if(imc < 18.5){
        println("Você está abaixo do peso")
    }else if(imc in 18.5..24.9){
        println("Você está no peso ideal")
    }else if(imc in 25.0..29.9){
        println("Você está sobrepeso")
    }else if(imc in 30.0..39.9){
        println("Você está obeso")
    }else{
        println("Você está com obesidade grave")
    }


    // Ranges - inicial..numeroFinal
     */


/*
    * when - quando o valor tiver o resultado da condição, alguma coisa será executada


    when(variavel){
    *
    * valor -> executa a ação
    }
*/


/*
    print("Digite um número de 1 a 3 e verifique como o programa te cumprimentará")
    val resp = readln().toInt()

    when(resp){
        1 -> {
            println("Oi")
            println("Tudo bem?")
        }
        2 -> println("Olá")
        3 -> println("Eae")
        else -> println("Número inválido")
    }
 */


// Exemplo de when com ranges

    print("Digite um número de 1 a 12 para verificarmos se é um mês quente ou frio: ")
    val mes = readln().toInt()

    when(mes){

        in 1..3 -> println("Mês quente")
        in 4..6 -> println("Mês quente/frio")
        in 7..9 -> println("Mês FRIO")
    }

}