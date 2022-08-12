programa
{

	/*
	 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente.
	 */
	
	funcao inicio()
	{
		inteiro codigoOp
		real horasTrab, salario = 0.0, excesso, hrExtra = 0.0

		escreva("Informe o seu código: ")
		leia(codigoOp)

		escreva("Informe as horas trabalhadas: ")
		leia(horasTrab)

		limpa()


		excesso = horasTrab - 50

		se(excesso > 0){
			salario = 50.0 * 10.0
			hrExtra = excesso * 20.0

			salario += hrExtra
			
			}senao{
				salario = horasTrab * 10
				}


		escreva("Salário total: ", salario)
		escreva("\nSalário extra: ", hrExtra)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 870; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */