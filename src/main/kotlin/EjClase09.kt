// CLASE 26-SEP-23. Arreglos
val nombres = listOf (
    "Pedro Luis",
    "Juan Manuel",
    "María Inés",
    "Romeo",
    "Ernesto",
    "Juan Pedro",
    "Ariadna",
    "Mireya María",
    "Ana Sofía",
    "José Juan"
)

fun main () {
    val nameCount = countName("Juan")
    println("Tu nombre se encontró $nameCount veces")
}

fun countName (name: String) : Int {
    var count = 0
    for (currentName in nombres) {
        if (name in currentName) {
            count++
        }
    }
    return count
}