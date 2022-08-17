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
    var idade = 0
    var sexo =0
    var opc = 0

    var pCalmas = 0
    var mNerv = 0
    var hAgre = 0
    var outCalm = 0
    var pNervMaior40 = 0
    var pCalmMenor18 = 0


    while(cont <= 150){
        println("${cont}° Pessoa Entrevistada.")

        print("Informe sua idade: ")
        idade = readln().toInt()

        print("Sexo:\n1-Feminino\n2-Masculino\n3-Outros\n>>> ")
        sexo = readln().toInt()

        println("Escolha a opção que se enquadra na sua características psicológicas no momento:")
        print("\n" +
                "1- Pessoa Calma\n" +
                "2- Pessoa Nervosa\n" +
                "3- Pessoa Agressiva\n" +
                ">>> ")
        opc = readln().toInt()

        if(opc == 1){
            pCalmas++
        }

        if(sexo == 1 && opc == 2){
            mNerv++
        }

        if(sexo == 2 && opc == 3){
            hAgre++
        }

        if(sexo == 3 && opc == 1){
            outCalm++
        }

        if(idade > 40 && opc == 2){
            pNervMaior40++
        }

        if(idade < 18 && opc == 1){
            pCalmMenor18++
        }

        cont++
    }

    println("==========================================================================")
    println("o número de pessoas calmas: $pCalmas")
    println("o número de mulheres nervosas: $mNerv")
    println("o número de homens agressivos: $hAgre")
    println("o número de outros calmos: $outCalm")
    println("o número de pessoas nervosas com mais de 40 anos: $pNervMaior40")
    println("o número de pessoas calmas com menos de 18 anos: $pCalmMenor18")

}