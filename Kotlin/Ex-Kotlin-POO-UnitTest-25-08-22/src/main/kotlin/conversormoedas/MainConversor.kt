package conversormoedas

fun main() {
    val conversor = ConversorDeMoedas()

    print("Informe o valor em reais: ")
    val real = readln().toDouble()

    print("Informe o valor da cotação do dolar atual: ")
    val dolar = readln().toDouble()

    println("Valor em Real: R$$real")
    println("Valor convertido para dolar: $${conversor.conversorDeRealParaDolar(real, dolar)}")
}