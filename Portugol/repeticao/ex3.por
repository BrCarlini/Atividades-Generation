programa
{

	// Exercício - ENQUANTO
	/**
	 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo.
	 */
	
	funcao inicio()
	{

		inteiro cont = 0
		real num, somaTotal = 0.0, media = 0.0

		enquanto(verdadeiro){

			escreva("\nInforme um número: ")
			leia(num)

			limpa()


			
			// Verifica se o numero é negativo, e para a execução caso for
			se(num < 0){
				escreva("Programa Encerrado\n")
				escreva("===============================\n")
				pare
				}

			// Incremento para verificar qauntos número foram lidos
			cont++

			// Acumula o total da soma entre todos os numeros lidos
			somaTotal += num


			media = somaTotal / cont

			
			}

		escreva("========== RESULTADO ==========\n")

		escreva("Total do somatório: ", somaTotal)
		escreva("\nMédia: ", media)
		escreva("\nTotal de valores lidos: ", cont)
	


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */