import { Cachorro } from "./src/cachorro";
import { Gato } from "./src/gato";

const animal1 = new Cachorro(
    "Toto",
    "Golden",
    12
)

console.log(`Nome: ${animal1.nome}`)
console.log(`Raça: ${animal1.raca}`)
console.log(`Idade: ${animal1.idade}`)

animal1.seMovimentar()
animal1.comer()
animal1.transmitirSom()

console.log("====================================")


const animal2 = new Gato(
    "Thor",
    "Persa",
    2
)

console.log(`Nome: ${animal2.nome}`)
console.log(`Raça: ${animal2.raca}`)
console.log(`Idade: ${animal2.idade}`)

animal2.seMovimentar()
animal2.comer()
animal2.transmitirSom()