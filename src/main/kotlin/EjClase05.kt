// CLASE 26-SEP-23. Ciclos For.

fun main () {
    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )
    for (nombre in nombres){
        println(nombre)
    }
    println("---")
    nombres.forEach { println(it) }
    println("---")

    for (nombre in nombres ) {
        println(nombre)
        if (nombre == "Link"){
            println("Presonaje Encontrado!")
            break
        }
    }

}
