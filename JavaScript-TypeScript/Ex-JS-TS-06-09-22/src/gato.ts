import { Animal } from "./animal";

export class Gato extends Animal{




    seMovimentar() {
        console.log("Se movimentar como um gato")
    }


    comer() {
        console.log("Comer como um gato")
    }


    transmitirSom() {
        console.log("Miau Miau")
    }

}