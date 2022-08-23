fun main() {
    val funcionario1 = Funcionario(
        "Bruno",
        "555.555.555.55",
        "55555555-5",
        "Desenvolvedor Mobile Jr",
        "191834",
        3500.0,
    )
    funcionario1.dataNasc = "11/11/1111"
    funcionario1.endereco = "Av. Bosque Encantado"

    print("Bateu a meta ? [1-Sim/2-Não]: ")
    val pergMeta = readln()

    if(pergMeta == "1"){
        print("Informe quantos porcento dara para o funcionario: ")
        val porc = readln().toDouble()
        println("Salário + Bonus de Meta Batida: ${funcionario1.bonusPorMeta(porc)}")
    }else{
        println("Se dedique mais!!")
    }
    println("=====================================================")
    funcionario1.visualizarDados()


}