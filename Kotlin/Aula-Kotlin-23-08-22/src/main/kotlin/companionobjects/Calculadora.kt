package companionobjects

class Calculadora {

    companion object{
        fun soma(n1: Double, n2: Double): Double{
            return n1 + n2
        }

        fun subtracao(n1: Double, n2: Double): Double{
            return n1 - n2
        }

        fun divisao(n1: Double, n2: Double): Double{
            return n1 / n2
        }

        fun multiplicar(n1: Double, n2: Double): Double{
            return n1 * n2
        }
    }
}