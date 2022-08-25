import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FuncionarioTest {

    private val func = Funcionario("Bruno", "33333333333", 2500.0)

    @Test
    fun bonusTest() {



        assertEquals(3000.0, func.bonus(20.0))
    }
}