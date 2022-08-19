// Sem retorno
fun verificarVida(vida: Int){

    if(vida <= 0){
        println("Você está morto.")
    }else if(vida <= 5){
        println("Personagem está morrendo.")
    }else if(vida <= 9){
        println("Personagem está bem.")
    }else{
        println("Personagem está ótimo.")
    }
}


// Com retorno
fun printarNomeMaiusculo(nome: String): String{
    return nome.uppercase()
}


fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}