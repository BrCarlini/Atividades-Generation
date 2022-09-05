/*
1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	apresente no final o total do somatório, a média e o total de valores lidos. O programa
	deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	negativo.
*/

const prompt = require("prompt-sync")()

let soma = 0
let cont = 0
let media = 0

while(true){
    let num = Number(prompt("Informe um número [numero < 0 o programa fecha]: "))

    if(num < 0){
        console.log("Programa encerrado.")
        break
    }

    cont++

    soma += num

    media = soma / cont
}

console.log(`Soma total: ${soma}`)
console.log(`Media: ${media}`)
console.log(`Total de valores lidos: ${cont}`)