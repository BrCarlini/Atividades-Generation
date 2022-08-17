fun main() {
    //3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    //idade for =-99. (WHILE)

    var totalMenorDe21 = 0
    var totalMaiorDe50 = 0

    while(true){
        print("Informe sua idade ou digite -99 para sair do programa:\n>>> ")
        val idade = readln().toInt()

        if(idade == -99){
            println("=========================================")
            break
        }

        if(idade < 21){
            totalMenorDe21++
        }else if(idade > 50){
            totalMaiorDe50++
        }else {
            continue
        }
    }
    println("=============== RESULTADO ===============")
    println("Total de pessoas com menos de 21 anos: $totalMenorDe21")
    println("Total de pessoas com mais de 50 anos: $totalMaiorDe50")
    println("=========================================")
    println("Programa Encerrado.")
}