package ex.aula.poo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DoadorTest : Doador(

    "dasdsa", "dasdasd", "dasdsadas", "asddasd", 5
)

var erro = false

@Test
fun checarDoadorTeste() {
    try {
        var doadorTeste = Doador("", "123", "Rua Camboio", "siso@13mal", 23)
    } catch (e: Exception) {
        erro = true
    }

    assertTrue(erro)
}