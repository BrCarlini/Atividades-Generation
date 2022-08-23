package encap

class Estudante(var nome: String, val ra: String) {

    private var nota = 0.0
    private val listaMaterias = mutableListOf<String>()

    // init - Executa alguma coisa no momento em um objeto for instanciado

    init {
        checarDados()
    }

    fun alterarNota(valor: Double){
        if (valor in 0.0..10.0){
            nota = valor
        }
    }

    fun checarDados(){
        if(nome == "" && ra.length <= 7){
            throw Exception("Estudante cadastrado de maneira incorreta")
        }
    }


}