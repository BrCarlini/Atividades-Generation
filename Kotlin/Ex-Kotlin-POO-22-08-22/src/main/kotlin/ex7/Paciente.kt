package ex7
/*
7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

class Paciente(
    var nome: String,
    val cpf: String,
    val dataNasc: String) {

    var convenio = false
    var statusPaciente = false // False = Paciente Normal / True = Paciente Grave

    private var listaPaciente = mutableListOf<String>()

    constructor(
        nome: String,
        cpf: String,
        dataNasc: String,
        convenio: Boolean,
        statusPaciente: Boolean
    ): this(nome, cpf, dataNasc){
        this.convenio = convenio
        this.statusPaciente = statusPaciente
    }

    fun addPaciente(nome: String, cpf: String, dataNasc: String){


    }


}