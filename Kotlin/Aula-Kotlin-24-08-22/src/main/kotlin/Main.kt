import heranca.Funcionario

fun main() {

    /*
    O que aprenderemos ?

    Herança - Classes pais(superclasses) e classes filhas

    Polimorfismo - Usar método com o mesmo nome, mas que executam coisa diferentes

        Sobrecarga de Métodos: Métodos com o mesmo, porém com parâmetros diferentes,
        que vão consequentemente executar outras funções.

        Sobrescrita de Métodos: Métodos com o mesmo nome, os mesmo parametros

    Classes abstratas - Classes pais que não podem ser instanciados, apenas seus filhos






    func.calcularSalario(0.2)
    func.exibirSalario()
    func.correr()
     */

    val func = Funcionario("Bruno", "23245657678", 34, 12345 )

    func.correr()
}