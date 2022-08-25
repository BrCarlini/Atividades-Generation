package ex1
/*
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a
todos os animais fique na classe Animal:


Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método
que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
 */

 open class Animal(
    var nome: String,
    var idade: Int) {

    open fun emitirSom(){
        print("Emitindo Som de: ")
    }

    open fun correr(){
        print("Correndo como: ")
    }

     fun exibirInfos(nome: String, idade: Int){
         println("Nome: $nome\nIdade: $idade")
     }
}