import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    /*
    @BeforeEach
     */

    val cliente = Cliente(
        "Henrique",
        "endereco",
        "555555")

    @BeforeEach
    fun adicionarNaLista(){
        cliente.addCompra("Toddy")
        cliente.addCompra("Macarrão")
        cliente.addCompra("Margarina")
        cliente.addCompra("Requijão")
    }

    @Test
    fun criarClienteTest(){

        var erro = false

        try {
            val clienteTest = Cliente("", "lkdsjf", "askldjf")
        }catch (e: Exception){
            erro = true
        }

        assertTrue(erro)

    }

    @Test
    fun addCompraTest() {

        assertEquals(4, cliente.listaCompras.size)
        assertTrue(cliente.listaCompras.contains("Toddy"))

    }

    @Test
    fun removeCompraTest() {

        cliente.removeCompra("Toddy")

        assertEquals(3, cliente.listaCompras.size)
        assertFalse(cliente.listaCompras.contains("Toddy"))

    }
}