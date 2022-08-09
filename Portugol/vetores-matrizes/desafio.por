programa
{

	/*
	
	Outono : De 21 de março a 21 de junho.
	Inverno: De 21 de junho a 23 de setembro.
	Primavera: De 23 de setembro a 21 de dezembro.
	Verão: De 21 de dezembro a 21 de março.
	
	*/
	
	funcao inicio()
	{

		inteiro menu
		cadeia estacao[4] = {"Outono : De 21 de março a 21 de junho.", "Inverno: De 21 de junho a 23 de setembro.", "Primavera: De 23 de setembro a 21 de dezembro.", "Verão: De 21 de dezembro a 21 de março."}
		
		
		escreva("Escolha uma estação do ano:\n[1]-Outono   [2]-Inverno\n[3]-Primavera   [4]-Verão\n>>> ")
		leia(menu)

		escolha(menu){

			caso 1:
				escreva("\n", estacao[0])
				pare
			caso 2:
				escreva("\n", estacao[1])
				pare
			caso 3:
				escreva("\n", estacao[2])
				pare
			caso 4:
				escreva("\n", estacao[3])
				pare
			caso contrario:
				escreva("\nOpção inválida")
		}


		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {estacao, 17, 9, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */