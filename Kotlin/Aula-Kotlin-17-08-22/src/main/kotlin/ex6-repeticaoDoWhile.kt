fun main() {
    //6- Escrever um programa que receba vários números inteiros no teclado. E no
    //final imprimir a média dos números múltiplos de 3. Para sair digitar
    //0(zero).(DO...WHILE)

    var contMult3 = 0
    var somaMult3 =0

    do{
        print("Informe algum número ou digite 0 para sair: ")
        val num = readln().toInt()


        // Valida a opção de saida && Contabiliza quais são multiplos de 3
        if(num == 0){
            break
        }else if(num % 3 == 0){
            contMult3++
            somaMult3 += num
        }else{
            continue
        }



    }while(true)

    println("=============== RESULTADO ===============")
    println("Quantidade de número multiplo de 3 ---> $contMult3")
    println("Soma entre os múltiplos de 3 ---------> $somaMult3")


    println("A média dos números múltiplos de 3 ---> ${somaMult3 / contMult3}")
}