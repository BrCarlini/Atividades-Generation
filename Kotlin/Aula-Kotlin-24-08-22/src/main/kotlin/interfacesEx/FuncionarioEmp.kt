package interfacesEx

interface FuncionarioEmp {

    var cargo: String
    var salario: Double
    val piso: Double

    fun calcularSalario(bonus: Double)

    fun exibirSalario()
}