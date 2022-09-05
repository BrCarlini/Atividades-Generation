/*
2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/

for(let i = 1; i <= 500; i++){
    if(i % 2 == 1 && i % 3 == 0){
        console.log("Ímpar e multiplo de 3: ", i)
    }
}