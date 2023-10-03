// CLASE 26-SEP-23. Arreglos

fun main () {
    // SET
    // Creamos dos sets con valores únicos y desordenados
    val numSet: Set <Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set <Int> = setOf(5, 4, 3, 2, 1, 0)

    // Creamos un set mutable
    var namess: Set <String> = mutableSetOf("Nombre1", "Nombre2")

    // MAP
    val namesToAges: Map <String, Int> = mapOf("user_one" to 20, "user_two" to 23)
    // Iterando un mapa
    for ((key, value) in namesToAges) {
        println("$key tiene $value años")
    }
}