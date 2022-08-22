fun main(args: Array<String>) {
    /*
    * POO:
    *
    * Classes e Objetos
    *
    * Classe Cachorro
    *   Atributos(Ou Estados) - raça, nome, cor, idade, patas, rabo
    *   Métodos (Ou comportamentos) - correr, latir, morder
    *
    *
    * Classe Pessoa
    *   Atributos -> Nome, IDade, CPF, RG, Nascionalidade, sexo
    *
    *   class Identificador(){
    *           Atributos e Métodos
    * }
    * */

    //Criar um objeto derivado da classe - Instância
    /*val bruno = Pessoa()

    bruno.nome = "Bruno"
    bruno.idade = 25
    bruno.cpf = "333.333.333-33"
    bruno.rg = "33333333-3"
    bruno.nascionalidade = "BR"
    bruno.sexo = "Masculino"

    println(bruno.nome)
    println(bruno.idade)
    println(bruno.cpf)
    println(bruno.rg)
    println(bruno.nascionalidade)
    println(bruno.sexo)
    */

    /*

    Classe conta Banco
        Atributos - Nome, Agencia, Conta, Saldo
        Métodos - Consultar Saldo, Sacar, Depositar

        Construtores
     */
    println("Digite o nome do cliente: ")
    val titular = readln()

    println("Digite a agencia: ")
    val agencia = readln()

    println("Digite a conta: ")
    val conta = readln()

    println("Digite o saldo inicial: ")
    val saldo = readln().toDouble()

    val conta1 = ContaBanco(
        titular,
        agencia,
        conta,
        saldo,
        true, 1000.0
    )

    conta1.consultarSaldo()
    conta1.saque(500.0)
    conta1.consultarSaldo()

    conta1.deposito(1500.0)
    conta1.consultarSaldo()

}


