package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val jose = Analista(nome = "José Geraldo", cpf = "987.654.321-22", salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(jose)
    }