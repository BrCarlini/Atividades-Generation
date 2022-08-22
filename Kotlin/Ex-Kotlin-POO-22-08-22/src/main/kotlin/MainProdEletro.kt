fun main() {
    print("Deseja ligar o Produto Eletronico ? [1-Sim/2-Não]: ")
    val op = readln()

    val prodX = ProdutoEletronico(
        nome = "Apple",
        serie = "100000000020000000",
        anoFabri = "2023"
    )

    prodX.botaoPower(op)
}