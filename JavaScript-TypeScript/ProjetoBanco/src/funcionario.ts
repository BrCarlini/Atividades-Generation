import { Pessoa } from "./pessoa";

export class Funcionario implements Pessoa{
    nome: string;
    idade: number;
    cpf: string;
    andar(): void {
        throw new Error("Method not implemented.");
    }
    correr(): void {
        throw new Error("Method not implemented.");
    }
}