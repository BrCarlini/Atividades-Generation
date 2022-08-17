fun main() {
    //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var contPar = 0
    var contImpar = 0

    for(i in 1..10){

        // Coleta o número
        print("Informe um número: ")
        val num = readln().toInt()

        // Verifica se é par ou ímpar e faz a contagem do mesmo
        if(num % 2 == 0){
            contPar++
        }else{
            contImpar++
        }
    }
    println("=========================")
    println("$contPar/10 são pares.")
    println("$contImpar/10 são ímpares.")


}