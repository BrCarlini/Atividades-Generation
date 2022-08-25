package companioneobjects

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    /*
    assertions - Verificar se o teste retorna exatamente aquilo que a gente
    especificar
    @Test - anotação que vai indicar que o método será um teste
     */

    @Test
    fun somaTest(){

        val soma = Calculadora.soma(5.0, 6.0)

        assertEquals(11.0, soma)

    }

    @Test
    fun subtracao(){

        val sub = Calculadora.subtracao(5.0, 5.0)

        assertEquals(0.0, sub)

    }

}