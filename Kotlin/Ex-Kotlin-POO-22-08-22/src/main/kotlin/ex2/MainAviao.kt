package ex2

fun main() {
    print("Informe a Marca do Avião: ")
    val marca = readln()

    print("Informe a Modelo do Avião: ")
    val modelo = readln()

    print("O tanque de gasolina esta cheio ? [1 - Sim/ 2 - Não]: ")
    val gasolina = readln()


    var maxGasolina:Boolean = false

    if(gasolina == "1"){
        maxGasolina = true
        //println(maxGasolina)
    }else{
        println("Para decolar é necessario tanque de gasolina cheio")
    }



    print("O avião está com o minimo de passageiros permitidos ? [1 - Sim/ 2 - Não]: ")
    val passageiros = readln()


    var minPassageiro:Boolean = false

    if (passageiros == "1"){
        minPassageiro = true
        //println(minPassageiro)
    }else{
        println("Não atingiu o minimo de passageiros para a decolagem!")
    }



    print("Informe a velocidade do Avião: ")
    val minVelocidade = readln().toDouble()

    val aviao1 = Aviao(
        marca,
        modelo,
        maxGasolina,
        minPassageiro,
        minVelocidade
    )



    aviao1.decolar(minVelocidade)
}