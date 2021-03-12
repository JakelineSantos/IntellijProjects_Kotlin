package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val adelino = Gerente(nome = "Adelino Mauro", cpf = "987.654.321-22", salario = 5000.00, senha = "5")
    ImprimeRelatorioFuncionario.imprime(adelino)

    TesteAutenticacao().autentica(adelino)
    }