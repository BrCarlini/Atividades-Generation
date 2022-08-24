package ex7

import ex7.Paciente.Companion.addPaciente
import ex7.Paciente.Companion.exibirListaPaciente

fun main() {


    for(i in 0..4){
        print("Informe o nome do paciente:")
        val nome = readln()

        print("Informe seu CPF(dado obrigatorio para entrar na lista de pacientes): ")
        val cpf = readln()

        print("Informe sua data de nascimento: ")
        val dataNasc = readln()

        val paciente = Paciente(nome, cpf, dataNasc)

        addPaciente(cpf)

    }

    exibirListaPaciente()
}