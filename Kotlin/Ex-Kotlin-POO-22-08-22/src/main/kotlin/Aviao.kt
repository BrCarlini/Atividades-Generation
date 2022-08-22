/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

class Aviao(
    var marca: String,
    var modelo: String,
    var maxGasolina: Boolean = false,
    var minPassageiro: Boolean = false,
) {
    var minVelocidade = 0.0

    constructor(
        marca: String,
        modelo: String,
        minPassageiro: Boolean,
        maxGasolina: Boolean,
        minVelocidade: Double
    ): this(marca, modelo, maxGasolina, minPassageiro){
        this.minVelocidade = minVelocidade
    }


    fun decolar(minVelocidade: Double){
        if (maxGasolina == true && minPassageiro == true){
            if(minVelocidade >= 280){
                println("Permissão de decolagem concedida com sucesso!!!")
                println("==================================================")
                exibirDadosAviao()
            }else{
                println("Decolagem Negada - Não atingiu Velocidade Minimo")
            }
        }else{
            println("Decolagem Negada")
        }
    }

    fun exibirDadosAviao(){
        println("Marca: $marca\nModelo: $modelo\nTaque cheio: $maxGasolina\nMinimo de Passageiros: $minPassageiro\nVelocidade da decolagem: $minVelocidade")
    }

}