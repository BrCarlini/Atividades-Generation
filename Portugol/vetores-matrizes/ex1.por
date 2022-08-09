programa
{

	/**
	 * Exercícios com Vetores[  ]
	1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	    Encontre após a maior pontuação e a apresente.
	 */
	
	funcao inicio()
	{
		real notas[5], maiorNota


		
		// Coloca os dados no vetor
		para(inteiro i = 0; i <= 4; i++){

				escreva("Informe a ", i+1, "° nota: ")
				leia(notas[i])

				limpa()
			}


		// Imprime todos os dados do vetor
		escreva("Todas as notas --> ")
		
		para(inteiro i = 0; i <= 4; i++){

				escreva(notas[i], "/ ")
			
			}
			
		// Verifica a maior nota
		maiorNota = notas[0]
		para(inteiro i = 0; i <= 4; i++){

				se(notas[i] > maiorNota){

						maiorNota = notas[i]
					}
			}


		escreva("\nA maior nota é: ", maiorNota)


		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */