package one.digitalinnovation.collections


fun main(){
    val joao = funcionario("Joao", 3000.0, "CLT")
    val maria = funcionario("Maria", 4000.0, "PJ")
    val ana = funcionario("Ana", 10000.0,"PJ")
    val jose = funcionario("jose", 2300.0, "CLT")


    val funcionarios = listOf(joao, maria, jose, ana)

    funcionarios.forEach{ println(it)}

    println("---------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------------------------")
    println(funcionarios.any {it == joao })

    println("---------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}

    println("---------------------------------")
    funcionarios
        .sortedBy { it.nome }
        .forEach{ println(it)}

    println("---------------------------------")
    funcionarios
        .groupBy{ it.tipoContratacao}
        .forEach{ println(it)}

        println("---------------------------------")



}


