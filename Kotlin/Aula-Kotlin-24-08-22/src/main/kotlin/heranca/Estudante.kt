package heranca

class Estudante(nome: String,
                cpf: String,
                idade: Int,
                val ra: String
): Pessoa(nome, cpf, idade) {

    private var nota = 0.0

    fun alterarNota(valor: Double){
        if(valor in 0.0..10.0){
            nota = valor
        }
    }

}