/*
5) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
		categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
*/

const prompt = require("prompt-sync")()

const idade = parseInt(prompt("Informe sua idade: "))

if(idade >= 5 && idade <= 7){
    console.log("Infantil A")
}else if(idade >= 8 && idade <= 11){
    console.log("Infantil B")
}else if(idade >= 12 && idade <= 13){
    console.log("Juvenil A")
}else if(idade >= 14 && idade <= 17){
    console.log("Juvenil B")
}else if(idade >= 18){
    console.log("Adulto")
}