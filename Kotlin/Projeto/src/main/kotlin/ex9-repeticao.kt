// Exercício - PARA
/*
*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
				a) média do salário da população;
				b) média do número de filhos;
				c) maior salário;
				d) percentual de pessoas com salário até R$100,00.
* */


fun main() {
    var perc = 0.0f
    var sal100 = 0
    var maiorSalario = 0.0f
    var totalFilhos = 0.0f
    var mediaFilhos = 0.0f
    var totalSal = 0.0f
    var mediaSalario = 0.0f
    val listaSal = FloatArray(20)
    val listaQtdFilhos = IntArray(20)


    // Abastece os Arrays de Salários e Filhos
    for (i in 0..19){
        println("${i+1}° Habitante")

        print("Informe o salário: ")
        val salario = readLine()!!.toFloat()

        print("Informe a quantidade de filhos: ")
        val qtdFilhos = readLine()!!.toInt()

        println("======================================================================")

        listaSal[i] = salario
        listaQtdFilhos[i] = qtdFilhos

        // a) média do salário da população
        totalSal += listaSal[i]
        mediaSalario = totalSal / (i+1)


        // b) média do número de filhos
        totalFilhos += listaQtdFilhos[i]
        mediaFilhos = totalFilhos / (i+1)

        // c) maior salário
        if(salario > maiorSalario){
            maiorSalario = salario
        }

        // d) percentual de pessoas com salário até R$100,00
        if(salario <= 100){
            sal100++
        }

        perc = ((sal100/20.0) * 100).toFloat()

    }




    println("======================================================================")
    println("a) Média do salário da população é de: R$$mediaSalario")
    println("b) Média de filhos da população é de: $mediaFilhos por familia")
    println("c) Maior salário: R$$maiorSalario")
    println("d) Percentual de pessoas com salário até R$100,00: $perc%")
    println("======================================================================")

}