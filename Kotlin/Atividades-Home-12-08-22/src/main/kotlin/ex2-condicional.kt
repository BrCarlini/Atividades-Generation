/*
	 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente.
	 */


fun main() {

    var salario: Float
    val excesso: Float
    var hrExtra = 0.0f

    print("Informe o seu código: ")
    val codigoOp = readLine()!!

    print("Informe as horas trabalhadas: ")
    val horasTrab = readLine()!!.toFloat()

    excesso = horasTrab - 50

    if(excesso > 0){
        salario = (50.0 * 10.0).toFloat()
        hrExtra = excesso * 20

        salario += hrExtra
    }else{
        salario = horasTrab * 10
    }

    println("Salário total: R$${salario}")
    println("Salário extra: R$${hrExtra}")

}