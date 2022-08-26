package ex.aula.poo

fun main(){
    while (true) {
        println("==================SISTEMA DE DOAÇÕES DE REMÉDIOS=========================")
        println("==========================O QUE VOCÊ É?==================================")
        println("{1} DOADOR")
        println("{2} BENEFICIADO")
        println("{3} SAIR")
        println("OPCAO: ")
        val opc = readln().toInt()
        println("===============================")
        print("NOME: ")
        val nome = readln()
        print("CPF: ")
        val cpf = readln()
        print("ENDEREÇO: ")
        val end = readln()
        print("EMAIL: ")
        val email = readln()
        println("IDADE: ")
        val idade = readln().toInt()
        when (opc) {
            1 -> doar(nome, cpf, end, email, idade)
            2 -> beneficiado(nome, cpf, end, email, idade)
            3 -> break
            4 -> println("SAINDO DO SISTEMA")
        }
    }
}
fun doar(nome: String, cpf: String, endereco: String, email: String, idade: Int){
    val doador = Doador(nome, cpf, endereco, email, idade)
    while(true){
        println("==============SISTEMA DOADOR=====================")
        println("{1} - DOAR")
        println("{2} - ALTERAR")
        println("{3} - MEU HISTÓRICO DOACOES")
        println("{4} - LISTAR ESTOQUE")
        println("{5} - SAIR")
        val opc = readln().toInt()
        when(opc){
            1 -> {
                println("DIGITE UM ITEM")
                val item = readln()
                doador.doacao(item)
            }
            2-> {
                println("DIGITE UM ITEM PARA SER ALTERADO")
                val item = readln()
                doador.alterarItens(item)
            }
            3 -> doador.exibirHistoticoD()
            4 -> doador.exibirLista()
            5 -> break
            6 -> println("OPÇÃO INVÁLIDA")
        }
    }
}
fun beneficiado(nome: String, cpf: String, endereco: String, email: String, idade: Int){
    val beneficiado = Beneficiario(nome, cpf, endereco, email, idade)
    while(true){
        println("==============SISTEMA BENEFICIADO=====================")
        println("{1} - RECEBER")
        println("{2} - LISTAR ESTOQUE")
        println("{3} - EXIBIR RECEBIDOS")
        println("{4} - SAIR")
        val opc = readln().toInt()
        when(opc){
            1 -> {
                println("DIGITE UM ITEM")
                val item = readln()
                beneficiado.receber(item)
            }
            2-> beneficiado.exibirLista()
            3 -> beneficiado.historicoB
            4 -> break
            else -> println("OPÇÃO INVÁLIDA")
        }
    }
}