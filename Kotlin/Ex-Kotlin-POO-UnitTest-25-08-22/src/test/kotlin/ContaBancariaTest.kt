import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class ContaBancariaTest {

    val contBank = ContaBancaria(
        "Bruno",
        "Carlini",
        "444.444.444.04",
        "33.33.33.33-3",
        foto = true,
        estadoConta = true
    )

    @Test
    fun verificaEstadoDaContaTest(){
        assertTrue(contBank.verificaEstadoDaConta())
    }
}