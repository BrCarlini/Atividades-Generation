// Exercício - ENQUANTO
/**
 * 2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */


fun main() {

    var op = 0
    var acum = 0

    print("Informe um número: ")
    var num = readLine()!!.toInt()


    while(true){

        println(num)

        if(num > 100){
            println("Programa Encerrado!!")
            break
        }

        num *= 3


    }
}