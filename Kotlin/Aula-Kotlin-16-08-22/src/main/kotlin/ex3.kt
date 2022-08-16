fun main() {
    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
        categoria ela se encontra:
         10-14 infantil
         15-17 juvenil
         18-25 adulto
    */

    print("Informe a idade: ")
    val idade = readln().toInt()

    if(idade in 10..14){
        println("Categoria Infantil.")
    }else if(idade in 15..17){
        println("Categoria Juvenil.")
    }else if(idade in 18..25){
        println("Categoria Adulto.")
    }else{
        println("Idade Inválida ou Sem Categoria.")
    }
}