import kotlin.reflect.typeOf

/*
    * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
		de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
		regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
		excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
		verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
		da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
		ZERO.
    * */

fun main() {

    val multa: Int = 4
    var excesso: Int = 0
    var valorMulta: Int = 0

    print("Informe o peso do tomate: ")
    val peso = readLine()!!.toInt() // Utiliza-se '!!' para garantir que o valor recebido não seja nulo

    if(peso > 50){
        excesso = peso - 50
        valorMulta = excesso * multa
        println("Foi multado!!\nValor da Multa: R$${valorMulta}\nExcedeu: ${excesso}Kg")
    }else{
        println("Não foi multado!\nPeso: ${peso}\nExcedeu: ${excesso}Kg \nValor da Multa: R$${valorMulta}")
    }
}