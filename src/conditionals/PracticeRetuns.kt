package conditionals

fun main() {
    println(squareArea(4))
    println(triangleArea(2,2))
    println(totalSquareAndTriangle())
}

fun squareArea(sideValue:Int):Int{
    val squareArea1 = sideValue * sideValue
    return  squareArea1
}

fun triangleArea(b:Int, h:Int):Int {
    val triangleArea1 = (b * h)/ 2
    return triangleArea1
}

fun totalSquareAndTriangle():Int {
    val totalST = triangleArea(2,2) + squareArea(2)
    return totalST
}