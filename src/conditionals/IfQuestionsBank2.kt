package conditionals

fun main() {
    twoNumbers(99, 9)
    println(twoNumbersReturn(9, 8))
    threeNumbers(66, 8, 9)
    println(threeNumbersReturn(3, 4, 5))
    checkingNumber1(0)
    println(checkingNumberReturn(-3))
    divisibleNumber(10)
    println(divisibleNumberReturn(110))
    evenOrOdd(3)
    println(evenOrOddReturn(4))
    leapYear1(2000)
}

//Write a program to find the maximum between two numbers

fun twoNumbers(num1: Int, num2: Int) {
    if (num1 > num2) {
        println("$num1 is greater than $num2")
    } else {
        println("$num2 is greater than $num1")
    }

    println(if (num2 > num1) "$num2 is greater than $num1" else "$num2 is less than $num1")
}

fun twoNumbersReturn(num1: Int, num2: Int): String {
    var value = ""
    if (num1 > num2) {
        value = "$value is greater"

    } else {
        value = "$value is greater"
    }
    return value
}

//Write a program to find the maximum between three numbers
fun threeNumbers(num1: Int, num2: Int, num3: Int) {
    if (num1 > num2 && num1 > num3) {
        println("$num1 is greater than $num2 and $num3")
    } else if (num2 > num1 && num2 > num3) {
        println("$num2 is greater than $num1 and $num3")
    } else if (num3 > num1 && num3 > num2) {
        println("$num3 is greater than $num2 and $num1")
    }
}

fun threeNumbersReturn(num1: Int, num2: Int, num3: Int): String {
    var maxValue = ""
    if (num1 > num2 && num1 > num3) {
        maxValue = "$num1 is greater than $num2 and $num3"
    } else if (num2 > num1 && num2 > num3) {
        maxValue = "$num2 is greater than $num1 and $num3"
    } else if (num3 > num2 && num3 > num1) {
        maxValue = "$num3 is greater than $num2 and $num1"
    }
    return maxValue
}

//Write a program to check whether a number is negative, positive, or zero
fun checkingNumber1(number1: Int) {
    if (number1 > 0) {
        println("$number1 is positive")
    } else if (number1 < 0) {
        println("$number1 is negative")
    } else if (number1 == 0) {
        println("$number1 is zero")
    }
}

fun checkingNumberReturn(number1: Int): String {
    var checkedNumb = ""
    if (number1 > 0) {
        checkedNumb = "$number1 is positive"
    } else if (number1 < 0) {
        checkedNumb = "$number1 is negative"
    } else if (number1 == 0) {
        checkedNumb = "$number1 is zero"
    }
    return checkedNumb
}
//Write a program to check whether a number is divisible by 5 and 11

fun divisibleNumber(num1: Int) {
    if (num1 % 5 == 0 && num1 % 11 == 0) {
        println("$num1 is divisible by 5 and 11")
    } else {
        println("$num1 is not divisible by number 5 and 11")
    }
}

fun divisibleNumberReturn(num1: Int): String {
    var divisibleNumber = ""
    if (num1 % 5 == 0 && num1 % 11 == 0) {
        divisibleNumber = "$num1 is divisible by 5 and 11"
    } else {
        divisibleNumber = "$num1 is not divisible by 5 and 11"
    }
    return divisibleNumber
}
//Write a program to check whether a number is even or odd

fun evenOrOdd(num1: Int) {
    if (num1 % 2 == 0) {
        println("$num1 is even")
    } else {
        println("$num1 is odd")
    }
}

fun evenOrOddReturn(num1: Int): String {
    var oddOrEven = ""
    if (num1 % 2 == 0) {
        oddOrEven = "$num1 is even"
    } else {
        oddOrEven = "$num1 is odd"
    }
    return oddOrEven
}

//Write a program to check whether a year is a leap year

fun leapYear1(year: Int) {
    if (year > 1582) {
        if (year % 4 != 0) {
            println("$year is a common year")
        } else if (year % 100 != 0) {
            println("$year is a leap year")
        } else if (year % 400 != 0) {
            println("$year is a common year")
        } else {
            println("$year is a leap year")
        }
    } else {
        println("leap year start from the year 1582")
    }
}


//Write a program to check whether a character is alphabet or not
