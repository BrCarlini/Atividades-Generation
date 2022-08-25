package conversormoedas

class ConversorDeMoedas() {

    fun conversorDeRealParaDolar(valorEmReal: Double, cotacao: Double): Double{
        return valorEmReal / cotacao
    }
}