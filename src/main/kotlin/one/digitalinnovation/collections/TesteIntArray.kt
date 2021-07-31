package one.digitalinnovation.collections

val values = IntArray(5)

fun main(){

    values[0] = 45
    values[1] = 10
    values[2] = 55
    values[3] = 49
    values[4] = 80


    for (valor in values){
        println(valor)
    }

    print("---------------------------\n")

    values.forEach {
        println(it)
    }

    print("---------------------------\n")

    values.forEach { valor ->
        println(valor)
    }

    print("---------------------------\n")

    for (index in values.indices){
        println("index: $index - valor: ${values[index]}")
    }

    print("---------------------------\n")
    for (index in values.indices) {
        println(index)
    }

    print("---------------------------\n")

    values.sort() //iterando do menor valor para o maior

    for (valor in values){
        println(valor)
    }
}