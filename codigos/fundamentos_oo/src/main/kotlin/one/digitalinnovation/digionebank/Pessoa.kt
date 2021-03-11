package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Maria"
    var cpf: String = "123.456.789-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val maria = Pessoa()
    println(maria.pessoaInfo())
}