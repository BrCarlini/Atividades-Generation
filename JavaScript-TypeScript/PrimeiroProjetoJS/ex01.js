/*
1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
		de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
		regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
		excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
		verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
		da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
		ZERO.
*/

const prompt = require("prompt-sync")()

let peso = Number(prompt("Informe o peso do tomate: "))

let excesso, multa

if(peso > 50){
    excesso = peso - 50
    multa = excesso * 4
    console.log(`Foi multado em R$${multa}`)
}else{
    excesso = 0
    multa = 0
    console.log("Não foi multado.")
    console.log(`Peso: ${peso}`)
    console.log(`Excesso: ${excesso}`)
    console.log(`Multa: ${multa}`)
}