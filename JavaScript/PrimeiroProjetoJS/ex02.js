/* 
2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	excedente.
*/

const prompt = require("prompt-sync")()

const codigo = prompt("Informe seu código: ")

const hrsTrabalhadas = Number(prompt("Informe as horas trabalhadas: "))


let valorExtra = 0, salario

let excesso = hrsTrabalhadas - 50 

if(excesso > 0){
    salario = 50 * 10
    valorExtra = excesso * 20

    salario += valorExtra
}else{
    salario = hrsTrabalhadas * 10
}

console.log(`Salário total: ${salario}`)
console.log(`Salário extra: ${valorExtra}`)