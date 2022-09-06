export abstract class Animal{

    nome: string
    raca: string
    idade: number

    constructor(
        nome: string,
        raca: string,
        idade: number
    ){
        this.nome = nome
        this.raca = raca
        this.idade = idade
    }

    abstract seMovimentar(): void

    abstract comer(): void

    abstract transmitirSom(): void
}