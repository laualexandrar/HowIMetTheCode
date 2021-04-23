package aboutfiles

fun main() {
//    println(myReturnEvenNumber(4))
//    println(recyclingReturnNumbers())
//    myReturnEvenNumberNoReturn(6)
//    recyclingNumberNoReturn()

    // With returns
    val resultMethod1 = myReturnEvenNumber(4)
    println("We have the value already: $resultMethod1")
    val resultMethod2 = recyclingReturnNumbers(resultMethod1)
    println("Final Result: $resultMethod2")

    val noReturn = myReturnEvenNumberNoReturn(6)
    //val noReturn2 = recyclingNumberNoReturn(noReturn) I can't re asign the val noReturn because is Unit
}

fun myReturnEvenNumber(myNum: Int): Int {
    var lookingForANumber = 0
    if (myNum % 2 == 0) {
        lookingForANumber = myNum + 2
    }
    return lookingForANumber
}

fun recyclingReturnNumbers(myNum: Int): Int {

    var numersito = myNum + 10

    return numersito
}

fun myReturnEvenNumberNoReturn(myNum: Int) {
    var newNumber = 0
    if (myNum % 2 == 0) {
        newNumber = myNum + 2
    }
    println(newNumber)

}

fun recyclingNumberNoReturn(myNum: Int) {

    var numersito = myNum + 10
    println(numersito)
}



