package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marco"

    var cpf: String = "123.456.789-00"
    private set
}

fun main() {
    val marco = Pessoa()

    println(marco.nome)
    println(marco.cpf)
}