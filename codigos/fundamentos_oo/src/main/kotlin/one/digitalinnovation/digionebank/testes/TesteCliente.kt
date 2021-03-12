package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val maicon = Cliente(
        nome = "Maicon Jackson",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(maicon)

    TesteAutenticacao().autentica(maicon)
}