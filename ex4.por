programa
{
	/*
	4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		número é par ou ímpar, e se é positivo ou negativo.
	
	*/
	
	funcao inicio()
	{
		inteiro num

		escreva("Informe um número inteiro: ")
		leia(num)

		limpa()


		se(num % 2 == 0){
			escreva("O número ", num, " é par.\n")
			}senao{
				escreva("O número ", num, " é ímpar.\n")
				}

		
		se(num < 0){
			escreva("Número informado é Negativo.")
			}senao{
				escreva("Número informado é Positivo.")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */