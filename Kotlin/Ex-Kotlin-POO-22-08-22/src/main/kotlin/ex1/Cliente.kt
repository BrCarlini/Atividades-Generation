package ex1/*
* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*
* */

class Cliente(
    var nome: String,
    val cpf: String,
    val rg: String,
    var email: String,
    var estadoDaConta: Boolean
) {
    var celular = ""


    // Construtor secundario
    constructor(
        nome: String,
        cpf: String,
        rg: String,
        email: String,
        estadoDaConta: Boolean,
        celular: String
    ): this(nome, cpf, rg, email, estadoDaConta){
        this.celular = celular
    }



    fun consultarDados(){
        println("Nome: $nome\nCPF: $cpf\nRG: $rg\nE-mail: $email\nEstado: $estadoDaConta\nCelular: $celular")
    }

    fun addCelular(numero:String){
        celular = numero
        println("Número alterado com sucesso!")
    }

}