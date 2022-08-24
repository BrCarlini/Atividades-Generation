package heranca

class Funcionario(nome: String,
                  cpf: String,
                  idade: Int,
                  val registro: Int,
): Pessoa(nome, cpf, idade) {

    private val piso = 1500.0
    private var salario = 0.0

    fun calcularSalario(bonus: Double){
        salario = piso + (bonus * piso)
    }

    fun exibirSalario(){
        println(salario)
    }

    override fun correr() {
        // super - Indicar alguma coisa da classe pai
        super.correr()
        println("Correr de Naruto")
    }

    override fun andar(){
        println("Andar como um Funcionario")
    }
}