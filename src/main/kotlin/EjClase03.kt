fun main () {
    println("Area con valores por defecto: ${prism()}")
}

fun reArea (b : Double = 10.0, h : Double = 5.0) : Double {
    return b * h
}

fun prism (l : Double = 10.0) :Double {
    return reArea() * l
}