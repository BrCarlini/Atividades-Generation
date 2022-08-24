package heranca


// open - Define que a classe podera ser herdada
open class Pessoa (var nome: String,
              val cpf: String,
              var idade: Int) {

    var corDePele = "Não especificado"
    var corDoCabelo = "Não especificado"

    // open - indica que ele vai poder ser sobrescrito na classe filha
    open fun correr(){
        println("Correndo")
    }

    open fun andar(){
        println("Andando")
    }
}