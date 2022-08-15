import kotlin.math.pow

fun main() {
    /*
    * 2 - Faça um programa em que o usuário digite o diâmetro de um
    *     círculo e calcule a área e o perímetro dele
    * */


    val pi = 3.14

    print("Digite o diâmetro do círculo: ")
    val diam = readln().toDouble()

    val raio = diam / 2

    val area = pi * raio.pow(2)

    val perim = 2 * pi * raio

    // format - padrão.format(numero)
    println("A área do círculo é: ${"%.2f".format(area)}")
    println("O perímetro do círculo é: ${"%.2f".format(perim)}")

}