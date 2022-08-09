programa
{
	inclua biblioteca Util

	/**
	 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
	 */
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma = 0, somaDiag

		// Armazenar os valores na matriz
		para(inteiro i = 0; i <= 2; i++){
				para(inteiro j = 0; j <= 2; j++){
						escreva("Informe um número: ")
						leia(matriz[i][j])
						limpa()

						soma += matriz[i][j]
							
				}
		}

		
		// Exibir a matriz preenchida
		escreva("Matriz:\n")
		para(inteiro i = 0; i <= 2; i++){
				para(inteiro j = 0; j <= 2; j++){
						se(j < 2){
							escreva(matriz[i][j], " ")
						}
						senao {
							escreva(matriz[i][j], "\n")
						}
				}
		}

		somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2]

		escreva("\nValor da soma entre todos os dados: ", soma)
		escreva("\nValor da soma entre os valores da diagonal: ", somaDiag)



		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 702; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 13, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */