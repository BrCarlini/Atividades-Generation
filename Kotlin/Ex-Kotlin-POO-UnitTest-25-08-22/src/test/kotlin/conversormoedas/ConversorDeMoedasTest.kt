package conversormoedas

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ConversorDeMoedasTest {


    @Test
    fun conversorDeRealParaDolarTest() {
        val conversorTest = ConversorDeMoedas()

        assertEquals(19.53125, conversorTest.conversorDeRealParaDolar(100.0, 5.12))
    }
}