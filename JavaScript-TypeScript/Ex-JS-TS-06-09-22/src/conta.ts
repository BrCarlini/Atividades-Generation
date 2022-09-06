

export abstract class Conta{

    titular: string;
    cpf: string;
    agencia: string;
    conta: string;
    saldo: number

    constructor(
        titular: string,
        cpf: string,
        agencia: string,
        conta: string,
        saldo: number
    ){
        this.titular = titular
        this.cpf = cpf
        this.agencia = agencia
        this.conta = conta
        this.saldo = saldo
    }

    abstract sacar(valor: number): void

    abstract depositar(valor: number): void

    exibirSaldo(){
        console.log(`Saldo disponível: R$${this.saldo}`)
    }
    
}