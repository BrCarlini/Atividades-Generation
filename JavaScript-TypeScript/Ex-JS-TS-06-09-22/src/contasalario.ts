import { Conta } from "./conta";


export class ContaSalario extends Conta{

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
    
}