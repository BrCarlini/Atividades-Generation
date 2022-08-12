programa
{
	
	funcao inicio()
	{
		// Exercício - PARA
		/*  
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
			coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
				a) média do salário da população;
				b) média do número de filhos;
				c) maior salário;
				d) percentual de pessoas com salário até R$100,00.
		 */



		 inteiro qtdFilhos, sal100=0
		 real salario = 0.0, acumSal = 0.0, mediaFilhos = 0.0, mediaSalario = 0.0, acumFilhos = 0.0, maiorSal = 0.0, perc=0.0
		 
		 para(inteiro i = 1; i <= 20; i++){

		 		escreva(i, "° Habitante\n\n")
		 		
		 		escreva("\nInforme o salário: ")
		 		leia(salario)

		 		escreva("Informa a quantidade de filhos: ")
		 		leia(qtdFilhos)

		 		limpa()
		 		

				// a) média do salário da população
		 		acumSal += salario
		 		mediaSalario = acumSal / i

				// b) média do número de filhos
				acumFilhos += qtdFilhos
				mediaFilhos = acumFilhos / i

				// c) maior salário
				se(salario > maiorSal){
					maiorSal = salario
					
					}

				// d) percentual de pessoas com salário até R$100,00
				se(salario <= 100){
					
					sal100++
					
					}

				perc = (sal100/20.0) * 100
		 		
		 	
		 	
		 	}
		 	escreva("\n======================================================================")
		 	escreva("\na) Média do salário da população é de: R$", mediaSalario)
		 	escreva("\nb) Média de filhos da população é de: ", mediaFilhos, " por familia")
		 	escreva("\nc) Maior salário: R$", maiorSal)
		 	escreva("\nd) Percentual de pessoas com salário até R$100,00: ", perc, "%")
		 	escreva("\n======================================================================")







		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */