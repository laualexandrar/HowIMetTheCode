package firstStepsMyProject

fun main() {
    val myListOneOfProducts = mutableListOf("chicken", "rice", "juice", "mango")
    val myListOfPrices = mutableListOf(3.30, 4.00, 5.20, 2.40)

    println (myListOneOfProducts[0])
    println(myListOfPrices[0])
    for (number in 0 until myListOneOfProducts.size){
     println("${myListOneOfProducts[number]}: ${myListOfPrices[number]} ")
    }
}