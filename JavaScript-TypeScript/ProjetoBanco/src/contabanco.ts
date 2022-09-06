
export abstract class ContaBanco{

    agencia: string
    conta: string
    titular: string
    saldo: number

    constructor(
        agencia: string,
        conta: string,
        titular: string,
        saldo: number
    ){
        this.agencia = agencia
        this.conta = conta
        this.titular = titular
        this.saldo = saldo
    }

    /*
    Encapsulamento
    public - pode ser acessado de qualquer arquivo
    private - pode ser acessado apenas no arquivo
    protected - pode ser acessado na classe pai e nas filhas
    */

    abstract sacar(valor: number): void

    abstract depositar(valor: number): void

    consultarSalto(){
        console.log(`Saldo da conta R$${this.saldo}`)
    }

}