package aboutfiles

import java.sql.DriverManager


fun main() {
    println(sumTwoNumbers(3, 6))
    println(threeNumbers(2, 33, 4))
    println(sumThreeNumbers(3, 5, 6))
    println(sumNumbers())
    println(scores(2.3,4.3,5.0))
}

fun sumTwoNumbers(num1: Int, num2: Int): Int {
    var sum1 = 0
    sum1 = num1 + num2
    return sum1
}

fun threeNumbers(number1: Int, number2: Int, number3: Int): Int {
    var sumNumbers = number1 + number2 + number3
    return sumNumbers
}

fun sumThreeNumbers(number1: Int, number2: Int, number3: Int): Int = number1 + number2 + number3

fun sumNumbers(): Int {
    var sumTheNumbers = sumTwoNumbers(2, 4) + sumThreeNumbers(4, 5, 6)
    var sumNumbers2 = sumTwoNumbers(5, 6) + sumTwoNumbers(7, 5)
    var sumNumbers3 = sumThreeNumbers(3, 4, 7) + sumThreeNumbers(3, 4, 5)
    var sumTotal = sumTheNumbers + sumNumbers2 + sumNumbers3
    return sumTotal
}

fun scores(Score1: Double, Score2: Double, Score3: Double ): Double {
    val totalScore = (Score1 + Score2 + Score3)/3
    return totalScore
}
