import java.time.LocalDate

fun main() {
    /*
    * 1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
    * */

    // LocalDate
    val ano = LocalDate.now().year //format(DateTimeFormatter.ofPattern("YYYY")).toInt()



    print("Você já fez aniversário esse ano ? (s/n) >> ")
    val resp = readln()


    val nasc: Int



    print("Digite sua idade: ")
    val idade = readln().toInt()

    if(resp == "s"){
        nasc = ano - idade
    }else{
        nasc = ano - (idade + 1)
    }



    println("O seu ano de nascimento é: $nasc")
}