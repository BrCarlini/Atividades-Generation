/* 
3) Desenvolva um sistema em que:
		- Leia 4 (quatro) números;
		- Calcule o quadrado de cada um;
		- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		- Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/

const prompt = require("prompt-sync")()

let n1 = Number(prompt("Informe o 1° numero: "))

let n2 = Number(prompt("Informe o 2° numero: "))

let n3 = Number(prompt("Informe o 3° numero: "))

let n4 = Number(prompt("Informe o 4° numero: "))

let q = n3 * n3

if(q >= 1000){
    console.log(`O 3° numero é ${n3} e seu valor quadrado é ${q}`)
}else{
    n1 *= n1
    n2 *= n2
    n4 *= n4
    console.log(`O 1° numero é ${n1} e seu valor quadrado é ${n1}`)
    console.log(`O 2° numero é ${n2} e seu valor quadrado é ${n2}`)
    console.log(`O 3° numero é ${n3} e seu valor quadrado é ${n3}`)
    console.log(`O 4° numero é ${n4} e seu valor quadrado é ${n4}`)
}