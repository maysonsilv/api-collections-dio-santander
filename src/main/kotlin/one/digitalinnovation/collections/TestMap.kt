package one.digitalinnovation.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Joao", 3400.0)
    val map1 = mapOf(pair)

    println("----------------------------")

    map1.forEach{ (k, v) -> println("Nome: $k - Salário: $v")}

    println("----------------------------")

    println(map1)

    println("----------------------------")
    for(x in map1){

        println(x)
    }

    val map2 = mapOf(
        "Pedro" to 2299.0,
        "Maria" to 4000.0
    )

    println("----------------------------")
    map2.forEach{ (k, v) -> println("Nome: $k - Salário: $v")}
}