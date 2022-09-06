import { ContaCorrente } from "./src/contacorrente";
import { ContaSalario } from "./src/contasalario";

const contaSalario = new ContaSalario(
    "Bruno",
    "111.111.111-11",
    "11111-1",
    "12345",
    5000.0
)

console.log(`Titular: ${contaSalario.titular}`)
console.log(`CPF: ${contaSalario.cpf}`)
console.log(`Agencia: ${contaSalario.agencia}`)
console.log(`Conta: ${contaSalario.conta}`)
contaSalario.exibirSaldo()

contaSalario.sacar(2500)
contaSalario.depositar(150)
contaSalario.exibirSaldo()


console.log("===========================================")


const contaCorrente = new ContaCorrente(
    "Aleh",
    "222.222.222-22",
    "11111-1",
    "67890",
    5000.0
)

console.log(`Titular: ${contaCorrente.titular}`)
console.log(`CPF: ${contaCorrente.cpf}`)
console.log(`Agencia: ${contaCorrente.agencia}`)
console.log(`Titular: ${contaCorrente.conta}`)
contaCorrente.exibirSaldo()

contaCorrente.sacar(3000)
contaCorrente.depositar(500)
contaCorrente.exibirSaldo()

console.log("===========================================")

contaCorrente.transferir(350, contaSalario)

console.log("Após a tranferencia de Aleh, Bruno ficou com: ")
contaSalario.exibirSaldo()