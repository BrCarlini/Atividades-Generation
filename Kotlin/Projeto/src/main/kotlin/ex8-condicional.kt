/*
	8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
		for maior que 100, caso contrário imprimi-la com o valor zero.
*/

fun main() {
    print("Informe um número: ")
    var num = readLine()!!.toFloat()

    if(num > 100){
        println("Número informado é maior que 100: $num")
    }else{
        num = 0.0f
        println(num)
    }
}