fun main () {
    println("Área con valores por defecto: ${reArea2()}")
    println("Área con altura por defecto: ${reArea2(10.0)}")
    println("Área con base por defecto: ${reArea2(h = 10.0)}")
    println("Área con named arguments: ${reArea2(h = 10.0, b = 5.0)}")
}

fun reArea2 (b : Double = 20.0, h : Double = 30.0) : Double {
    return b * h
}