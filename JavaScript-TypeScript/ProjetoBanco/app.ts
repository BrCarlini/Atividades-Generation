/*
Conta Banco
    Atributos - agencia, conta, titular, saldo
    Métodos - sacar, depositar, verSaldo

Conta Corrente(superclasse ContaBanco)
    Atributos - limite
    Métodos - alterarLimite
*/

import PromptSync from "prompt-sync";
import { ContaCorrente } from "./src/contacorrente";

const prompt = PromptSync()

let nome = Number(prompt("Digite seu nome: "))

let contaCorrente = new ContaCorrente(
    "00000",
    "00000-00",
    "Henrique",
    1500.0,
    1000
)

contaCorrente.consultarSaldo()

contaCorrente.alterarLimite(5000)

contaCorrente.sacar(2500)

contaCorrente.consultarSaldo()

function add(a:string, b:string):string

function add(a:number, b:number): number

function add(a: any, b:any): any {
    return a + b;
}