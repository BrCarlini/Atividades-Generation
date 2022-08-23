/*
5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

class Patinete(
    val marca: String,
    val tamanho: String,
    val material: String
) {

    fun andarComPatinete(){
        println("Andando com o Patinete")
    }
}