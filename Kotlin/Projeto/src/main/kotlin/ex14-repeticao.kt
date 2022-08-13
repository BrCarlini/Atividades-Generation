// Exercício - FAÇA... ENQUANTO
/**
 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
 */

fun main() {
    var cont = 1
    var acum = 0

    print("Informe uma número: ")
    val num = readLine()!!.toInt()

    var op = num
    print(num)

    do{

        acum += op

        op -= 1

        cont++

        if(op == 0){
            print(" = ")
            break
        }

        print(" + $op")


    }while(cont <= num)


    print(acum)
}