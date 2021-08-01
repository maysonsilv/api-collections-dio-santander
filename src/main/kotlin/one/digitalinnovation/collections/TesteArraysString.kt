package one.digitalinnovation.collections

fun main(){

    val values = Array(4){""}
    values[0] = "Jose"
    values[1] = "Maria"
    values[2] = "Joao"
    values[3] = "Ana"

    for(nome in values) {
        println(nome)
    }

    println("----------------------")

    values.sort()
    values.forEach { println(it) }


    println("----------------------")
    val nomes = arrayOf("Jose", "Maria","Ana", "Joao")


    nomes.forEach { println(it) }

    println("------------------------")
    nomes[2] = "Ana Paula"

    println("------------------------")


    for (nome in nomes.indices){
        println("posição: $nome - nome: ${nomes[nome]}   ")


    }

}