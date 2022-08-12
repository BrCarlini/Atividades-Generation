/*
	 * 3) Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */

fun main() {
    val q1: Int
    val q2: Int
    val q3: Int
    val q4: Int


    print("Informe o 1° número: ")
    val n1 = readLine()!!.toInt()

    print("Informe o 2° número: ")
    val n2 = readLine()!!.toInt()

    print("Informe o 3° número: ")
    val n3 = readLine()!!.toInt()

    print("Informe o 4° número: ")
    val n4 = readLine()!!.toInt()

    q3 = n3 * n3

    if(q3 > 1000){
        println("O quadrado do 3° número é $q3")
    }else{
        q1 = n1 * n1
        q2 = n2 * n2
        q4 = n4 * n4

        println("O 1° número é $n1 e seu quadrado é $q1")
        println("O 2° número é $n2 e seu quadrado é $q2")
        println("O 3° número é $n3 e seu quadrado é $q3")
        println("O 4° número é $n4 e seu quadrado é $q4")
    }


}