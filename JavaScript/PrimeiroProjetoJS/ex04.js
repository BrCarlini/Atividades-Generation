/*
4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		número é par ou ímpar, e se é positivo ou negativo
*/

const prompt = require("prompt-sync")()

const num = parseInt(prompt("Informe um número e descubra se é par ou ímpar: "))

if(num % 2 == 0){
    console.log(`O número ${num} é par`)
}else{
    console.log(`O número ${num} é ímpar`)
}