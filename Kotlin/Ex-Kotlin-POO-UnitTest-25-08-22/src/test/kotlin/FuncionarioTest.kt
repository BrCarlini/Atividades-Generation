import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FuncionarioTest {

    @Test
    fun bonusTest() {

        val func = Funcionario("Bruno", "33333333333", 2500.0)

        assertEquals(3000.0, func.bonus(20.0))
    }
}