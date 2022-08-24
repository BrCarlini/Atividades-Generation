package ex6

fun main() {
    val conta1 = ContaBancaria(
        "Bruno",
        "Carlini",
        "333.333.333.33",
        "33333333-3",
        true,
        true,
    )
    print("Deseja cadastrar um email ? [1-SIM/2-NÃO]: ")
    val mail = readln()

    if(mail == "1"){
        print("Informe o seu e-mail: ")
        val email = readln()
        conta1.email = email
        println("Email cadastrado!")
    }


    print("Deseja cadastrar um número de celular ? [1-SIM/2-NÃO]: ")
    val cel = readln()

    if(cel == "1"){
        print("Informe seu celular: ")
        val celular = readln()
        conta1.celular = celular
        println("Celular cadastrado!")
    }

    //conta1.verificaEstadoDaConta()
    println("Estado da Conta: ${conta1.estadoConta}")
    conta1.contratarSeguro()

    println("Seguro: ${conta1.seguro}")
}