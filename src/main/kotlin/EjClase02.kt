fun main (){
    val calif = prom(c3 = 10f)
    println("El promedio final es : $calif")
}
fun prom (c1 : Float = 8f,
          c2 : Float = 8f,
          c3 : Float) : Float {
    return (c1 + c2 + c3) / 3f
}