fun main() {
    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    */

    print("Informe o 1° número: ")
    val num1 = readln().toInt()

    print("Informe o 2° número: ")
    val num2 = readln().toInt()

    print("Informe o 3° número: ")
    val num3 = readln().toInt()

    if(num1 >= num2 && num1 >= num3){
        println("O 1° número é maior: $num1 > que $num2 e $num3")
    }else if(num2 >= num1 && num2 >= num3){
        println("O 2° número é maior: $num2 > que $num1 e $num3")
    }else{
        println("O 3° número é maior: $num3 > que $num2 e $num1")
    }
}