programa
{

	/*
	 * 3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */
	
	funcao inicio()
	{
		inteiro n1, q1, n2, q2, n3, q3, n4, q4

		escreva("Informe o 1° numero: ")
		leia(n1)

		escreva("Informe o 2° numero: ")
		leia(n2)

		escreva("Informe o 3° numero: ")
		leia(n3)

		escreva("Informe o 4° numero: ")
		leia(n4)

		limpa()

		q3 = n3 * n3

		se(q3 >= 1000){
			escreva("O Quadrado do 3° numero é ", q3)
			}senao{
				q1 = n1 * n1
				q2 = n2 * n2
				q4 = n4 * n4
				escreva("O 1° numero é ", n1, " e seu quadrado é ", q1)
				escreva("\nO 2° numero é ", n2, " e seu quadrado é ", q2)
				escreva("\nO 3° numero é ", n3, " e seu quadrado é ", q3)
				escreva("\nO 4° numero é ", n4, " e seu quadrado é ", q4)
				
				}
		


		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 623; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */