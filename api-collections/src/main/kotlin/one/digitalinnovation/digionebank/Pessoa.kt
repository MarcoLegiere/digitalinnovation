package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "marco"
    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo() = "${nome.capitalize()} e $cpf"
}

fun main() {
    val marco = Pessoa()

    println(marco.pessoaInfo())
}