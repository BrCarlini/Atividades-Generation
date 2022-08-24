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


    companion object{
        private var listaPaciente = mutableListOf<String>()
        fun addPaciente(cpf: String){
            if(cpf.isNotBlank()){
                listaPaciente.add(cpf)
            }
        }
        fun exibirListaPaciente(){
            println("========== Lista de Pacientes(CPF) ==========")
            listaPaciente.forEach {
                println(it)
            }
        }
    }



}