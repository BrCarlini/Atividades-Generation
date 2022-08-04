programa
{

	/*
	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
		for maior que 100, caso contrário imprimi-la com o valor zero.
	*/
	
	funcao inicio()
	{
		real num

		escreva("Informe um número: ")
		leia(num)

		limpa()

		se(num > 100){
			escreva("Número informado maior que 100: ", num)
			}senao{
				num = 0.0
				escreva(num)
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */