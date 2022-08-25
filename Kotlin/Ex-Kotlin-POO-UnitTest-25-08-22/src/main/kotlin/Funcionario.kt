class Funcionario(
    var nome: String,
    val cpf: String,
    var salario: Double
    ) {


    var bonusSalarial = 0.0

    fun bonus(porcBonus: Double): Double{
        val op = (porcBonus / 100) * salario

        val salarioComBonus = salario + op

        return salarioComBonus
    }
}