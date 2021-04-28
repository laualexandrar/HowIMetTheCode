package sealedclasses

fun main() {
myTransaction("papa")
}
fun myTransaction(type: String) {
    when (type) {
        "Sale" -> println("This is a sale")
        "Purchase" -> print("This is a purchase")
        else -> println("Nothing")
    }
}