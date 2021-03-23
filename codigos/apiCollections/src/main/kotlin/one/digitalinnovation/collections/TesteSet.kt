package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ("João", 2000.0, "CLT")
    val pedro = Funcionario ("Pedro", 1500.0, "PJ")
    val maria = Funcionario ("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf (joao, pedro)
    val funcionarios2 = setOf (maria)

    val resultunion = funcionarios1.union (funcionarios2)
    resultunion.forEach {println (it)}

    println ("--------------------")
    val funcionarios3 = setOf (joao, pedro, maria)
    val resultsubtract = funcionarios3.subtract (funcionarios2)
    resultsubtract.forEach {println (it)}

    println ("--------------------")
    val resultintersect= funcionarios3.intersect (funcionarios2)
    resultintersect.forEach {println (it)}
}