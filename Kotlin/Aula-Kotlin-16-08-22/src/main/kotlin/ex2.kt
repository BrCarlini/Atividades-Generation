fun main() {
    /*
    * 2- Faça um programa que entre com três números e coloque em ordem crescente.
    * */

    print("Informe o 1° número: ")
    val num1 = readln().toInt()

    print("Informe o 2° número: ")
    val num2 = readln().toInt()

    print("Informe o 3° número: ")
    val num3 = readln().toInt()

    if(num1 <= num2 && num1 <= num3){
        println(num1)
        if(num2 <= num3){
            println(num2)
            println(num3)
        }else{
            println(num3)
            println(num2)
        }
    }else if(num2 <= num1 && num2 <= num3){
        println(num2)
        if(num1 <= num3){
            println(num1)
            println(num3)
        }else{
            println(num3)
            println(num1)
        }
    }else{
        println(num3)
        if(num1 <= num2){
            println(num1)
            println(num2)
        }else{
            println(num2)
            println(num1)
        }
    }


}