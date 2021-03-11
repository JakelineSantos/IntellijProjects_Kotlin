package one.digitalinnovation.digionebank.testes

class Pessoa {
    var nome: String = "Maria"
    var cpf: String = "123.456.789-11"
}

fun main(){
    val maria = Pessoa()

    println(maria.nome)
    println(maria.cpf)
}