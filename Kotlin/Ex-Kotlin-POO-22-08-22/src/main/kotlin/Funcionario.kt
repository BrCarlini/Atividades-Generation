/*
4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */

class Funcionario(
    var nome: String,
    val cpf: String,
    val rg: String,
    var cargo: String,
    val matricula: String,
    var salario: Double
) {
    var dataNasc = ""
    var endereco = ""
    var metaMensal = 0.0

    constructor(
        nome: String,
        cpf: String,
        rg: String,
        cargo: String,
        matricula: String,
        salario: Double,
        dataNasc: String,
        endereco: String,
        metaMensal: Double
    ): this(nome, cpf, rg, cargo, matricula, salario){
        this.dataNasc = dataNasc
        this.endereco = endereco
        this.metaMensal = metaMensal
    }


    fun visualizarDados(){
        println("Nome: $nome\nCPF: $cpf\nRG: $rg\nCargo: $cargo\nMatricula: $matricula\nSalario: $salario\nData de nascimento: $dataNasc\nEndereço: $endereco")
    }

    fun bonusPorMeta(bonusPorc: Double): Double{
        val valorEmDin = (bonusPorc/100) * salario
        return salario + valorEmDin
    }


}