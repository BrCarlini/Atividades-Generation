package ex5

fun main() {
    val patinete1 = Patinete(
        "Nike",
        "Media",
        "Metal"
    )

    print("Usuario tem capacete ? [1-SIM/2-NÃO]: ")
    val op = readln()

    if (op == "1"){
        patinete1.andarComPatinete()
    }else{
        println("Sem permissão para andar de patinete.")
    }
}