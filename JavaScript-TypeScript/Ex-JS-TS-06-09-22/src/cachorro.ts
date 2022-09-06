import { Animal } from "./animal";

export class Cachorro extends Animal{




    seMovimentar() {
        console.log("Se movimentar como um cachorro")
    }


    comer() {
        console.log("Comer como um cachorro")
    }


    transmitirSom() {
        console.log("Au au")
    }

}