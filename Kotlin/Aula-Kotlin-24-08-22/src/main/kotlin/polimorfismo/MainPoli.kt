package polimorfismo

fun main() {
    /*
    Sobrecarga de Métodos - Métodos com o mesmo, porém com parâmetros diferentes,
    que vão consequentemente executar outras funções.

    Sobrescrita de Métodos - Métodos com o mesmo nome, os mesmo parametros

     */
    soma(2.0, 4.0)



}

fun soma(n1: Double, n2:Double): Double{
    return n1 + n2
}

fun soma(n1: Int, n2:Int): Int{
    return n1 + n2
}