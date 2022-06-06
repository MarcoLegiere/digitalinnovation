package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.info())
}