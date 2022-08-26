package ex.aula.poo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ListaItensTest: Doador (
    "dsadas",
    "12345678912",
    "dadasd",
    "asdsad",
    5
) {

    @BeforeEach
    fun listagem () {
        ListaItens.adcItem("item1")
        ListaItens.adcItem("item2")
        ListaItens.adcItem("item3")
    }
    @Test
    fun adcDoacaoTest() {
        assertEquals(3, ListaItens.listaItens.size)

    }
    @Test
    fun removerItemTest (){

        ListaItens.removerItens("item1")
        assertEquals(2, ListaItens.listaItens.size)


    }



}