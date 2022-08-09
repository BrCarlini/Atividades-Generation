programa
{
	inclua biblioteca Util

	/**
	 * Exercícios com Vetores[  ]
	 * 
	2 -Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	A seguir determine e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	
	 */
	
	funcao inicio()
	{
		inteiro num[10], maiorNum=0, cont = 0 
		real media = 0.0, soma = 0.0

		// Sorteio
		para(inteiro i = 0; i <= 9; i++){

				num[i] = Util.sorteia(1, 6)
		}


		//maiorNum = num[0]


		// Exibir todos os dados do vetor e gerar o resultado da soma de todos os dados
		escreva("Todos os dados armazenados no vetor --> ")
		para(inteiro i = 0; i <= 9; i++){

				// Imprimi dados
		 		escreva(num[i], "/ ")

		 		
				// Soma todos os dados
		 		soma += num[i]


				// Verifica o maior número
		 		se(num[i] > maiorNum){
		 			
		 			maiorNum = num[i]
		 			cont++
		 		}
		 			
		 }

		// Gera a media da soma entre todos os dados
		 media = soma / 10

		
		 escreva("\nA soma de todos os dados é: ", soma, "\nMédia: ", media)
		 escreva("\nO maior número foi alterado: ", cont, " vezes")


			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */