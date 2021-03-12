package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val maria = Pessoa(nome = "Maria Antonieta" , cpf = "987.654.321-99")
    println(maria.nome)
    println(maria.cpf)
}