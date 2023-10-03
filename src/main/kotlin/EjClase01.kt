import kotlin.math.pow
const val vPI = 3.1415f
const val PHI = 1.618f

fun main (){
    val radius = 4f
    val area = circleArea(radius)
    println("El área del círculo es : $area")
    println(getPI())
    printPHI()
}

fun circleArea (radius:Float) : Float {
    return vPI * radius.pow(2)
}

fun getPI () : Float{
    return vPI
}

fun printPHI (){
    println("El número áureo es : $PHI")
}