/*
	6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
		categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos

	*/

fun main() {
    print("Informe o nome do(a) nadador(a): ")
    val nome = readLine()!!

    print("Informe a idade do(a) nadador(a): ")
    val idade = readLine()!!.toInt()

    if(idade in 5..7){   //(idade >= 5 && idade <= 7)
        println("Nome: $nome\nCategoria: Infantil A")
    }
    else if(idade in 8..11){   //(idade >= 8 && idade <= 11)
        println("Nome: $nome\nCategoria: Infantil B")
    }
    else if(idade in 12..13){   //(idade >= 12 && idade <= 13)
        println("Nome: $nome\nCategoria: Juvenil A")
    }
    else if(idade in 14..17){   //(idade >= 14 && idade <= 17)
        println("Nome: $nome\nCategoria: Juvenil B")
    }
    else if(idade >= 18){
        println("Nome: $nome\nCategoria: Adulto")
    }
    else{
        println("Idade incompatível para as categorias disponíveis")
    }
}