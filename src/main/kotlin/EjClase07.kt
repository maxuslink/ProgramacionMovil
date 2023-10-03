// CLASE 26-SEP-23. Arreglos

fun main () {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers)
    println("Número de elementos: ${numbers.size}")
    println("Segundo elemento: ${numbers.get(1)}")
    println("Cuarto elemento: ${numbers.get(3)}")
    println("Último elemento: ${numbers.get(numbers.size - 1)}")
    println("Index del elemento \"four\": ${numbers.indexOf("four")}")

    println("---")
    val list = mutableListOf(1, 2, 3, 4)
    //Agregar elementos
    list.add(5)
    //Remover elementos
    list.removeAt(1)
    //Modificar elementos
    list[0] = 0
    println(list)
}
