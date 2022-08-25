class ContaBancaria(
    var nome: String,
    var sobrenome: String,
    val cpf: String,
    val rg: String,
    var foto: Boolean,
    var estadoConta: Boolean
) {
    var email = ""
    var celular = ""
    var seguro = false

    constructor(
        nome: String,
        sobrenome: String,
        cpf: String,
        rg: String,
        foto: Boolean,
        estadoConta: Boolean,
        email: String,
        celular: String,
        seguro: Boolean
    ): this(nome, sobrenome, cpf, rg, foto, estadoConta){
        this.email = email
        this.celular = celular
        this.seguro = seguro
    }

    fun verificaEstadoDaConta(): Boolean {
        if(estadoConta){
            println("Conta Ativa")
        }
        return estadoConta
    }

    fun contratarSeguro(){
        if(verificaEstadoDaConta()){
            println("Candidato a contratar Seguro.\nDeseja contratar ?[1-SIM/2-NÃO]")
            val resp = readln()

            if (resp == "1"){
                seguro = true
            }
        }else{
            println("Não é candidato para contratar o Seguro. Conta está desativada")
        }
    }

}