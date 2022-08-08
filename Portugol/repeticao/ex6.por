programa
{

	// Exercício - FAÇA... ENQUANTO
	/**
	 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28.
	 */
	
	funcao inicio()
	{
		inteiro num, cont = 1, acum = 0

		escreva("Informe uma número: ")
		leia(num)

		inteiro op = num
		escreva(num)
		
		faca{
			
			acum += op
			
			op -= 1

			cont++

			se(op == 0){
				escreva(" = ")
				pare
				}

			escreva(" + ", op)
			
			
			}enquanto(cont <= num)


		escreva(acum)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */