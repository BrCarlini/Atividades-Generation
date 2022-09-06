import { Conta } from "./conta";

export class ContaCorrente extends Conta{

    sacar(valor: number): void {
        if(valor < this.saldo){
            this.saldo -= valor
            console.log(`Saque de R$${valor} realizado com sucesso.`)
        }else{
            console.log("Impossivel o saque deste valor.")
        }
    }

    depositar(valor: number): void {
        if(valor > 0.0){
            this.saldo += valor
            console.log(`Deposito de R$${valor} realizado com sucesso.`)
        }else{
            console.log("Impossivel o deposito deste valor.")
        }
    }

    transferir(valor: number, titular: Conta): void{
        if(valor > 0.0 && this.saldo >= valor){
            this.saldo -= valor
            titular.saldo += valor
            console.log(`Realizado tranferencia de R$${valor} para ${titular.titular}`)
        }
    }

}