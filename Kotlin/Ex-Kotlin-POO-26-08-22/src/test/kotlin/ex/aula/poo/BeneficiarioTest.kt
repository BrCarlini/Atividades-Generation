package ex.aula.poo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BeneficiarioTest : Beneficiario(
    "dasdsa", "12345678912", "Rua: xxxx", "je@email", 2
)

var errada = false

@Test
fun checarBeneficiarioTeste() {
    try {
        var beneficiarioTest = Doador("", "123", "Rua Camboio", "siso@13mal", 23)
    } catch (e: Exception) {
        errada = true
    }

    assertTrue(errada)
}