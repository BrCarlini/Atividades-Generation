fun main() {
    //4- Uma empresa desenvolveu uma pesquisa para saber as características
    //psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    //era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    //agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    //pessoas, calcule e mostre: (WHILE)

    // o número de pessoas calmas;
    // o número de mulheres nervosas;
    // o número de homens agressivos;
    // o número de outros calmos;
    // o número de pessoas nervosas com mais de 40 anos;
    // o número de pessoas calmas com menos de 18 anos.

    var cont = 1
    var pessoaCalma = 0

    while(cont <= 5){
        println("$cont° Pessoa Entrevistada.")

        print("Informe sua idade: ")
        val idade = readln().toInt()

        print("Sexo:\n1-Feminino\n2-Masculino\n3-Outros\n>>> ")
        val sexo = readln().toInt()

        println("Escolha a opção que se enquadra na sua características psicológicas no momento:")
        print("\n" +
                "1- Pessoa Calma\n" +
                "2- Pessoa Nervosa\n" +
                "3- Pessoa Agressiva\n" +
                ">>> ")
        val opcao = readln().toInt()

        if(opcao == 1){
            pessoaCalma++
        }else if(){}


        cont++
    }
}