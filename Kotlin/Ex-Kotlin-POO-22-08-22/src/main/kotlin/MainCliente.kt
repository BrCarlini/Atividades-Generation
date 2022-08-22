fun main() {

    val cliente1 = Cliente(
        nome = "Bruno",
        cpf = "333.333.333-09",
        rg = "33333333-3",
        email = "bruno-cliente1@hotmail.com",
        estadoDaConta = true,
        celular = ""
    )

    val cliente2 = Cliente(
        nome = "Aleh",
        cpf = "444.444.444-10",
        rg = "44444444-4",
        email = "aleh-cliente2@hotmail.com",
        estadoDaConta = true,
        celular = "(11)999999999"
    )

    cliente2.consultarDados()
    println()
    cliente1.consultarDados()
    println("========================================")

    if(cliente1.celular == ""){
        println("Informe um número valido: ")
        val n = readln()
        cliente1.addCelular(n)
    }
    println("========================================")

    cliente1.consultarDados()
}