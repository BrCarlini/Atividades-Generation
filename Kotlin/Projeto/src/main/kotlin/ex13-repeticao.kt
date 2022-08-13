// Exercício - FAÇA... ENQUANTO
/**
 * 1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */


fun main() {
    
    var numero = 233

    do{

        if(numero in 300..400){

            numero += 3
            println(numero)

        }else{
            numero += 5
            println(numero)
        }


    }while(numero <= 456)
}