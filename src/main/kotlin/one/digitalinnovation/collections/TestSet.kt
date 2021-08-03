package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", 3000.0, "CLT")
    val maria = funcionario("Maria", 4000.0, "PJ")
    val ana = funcionario("Ana", 10000.0, "PJ")
    val jose = funcionario("jose", 2300.0, "CLT")

    val funcionario1 = setOf(joao, jose)
    val funcionario2 = setOf(maria,ana)

    val resultUnion = funcionario1.union(funcionario2)

    resultUnion.forEach { println(it) }

    println("------------------------")

    val funcionario3 = setOf(joao, jose, ana, maria)

    val resultSub = funcionario3.subtract(funcionario2)
    resultSub.forEach { println(it) }

    println("------------------------")
    val resultInt = funcionario3.intersect(funcionario2)
    resultInt.forEach { println(it) }
}