package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Pessoa(nome = "Maria Antonieta" , cpf = "987.654.321-99")
    println(maria.nome)
    println(maria.cpf)

    val jose = Funcionario(nome = "José Geraldo" , cpf = "234.567.789-22" , BigDecimal.valueOf(2000.00))
    println(jose.nome)
    println(jose.cpf)
    println(jose.salario)
}