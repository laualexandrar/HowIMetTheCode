package conditionals

fun main() {
    maxNumbers3(15, 9)
    println(maxNumbReturn3(15, 9))
    maxThreeNumb3(10, 5, 5)
    println(maxThreeNumbReturn3(5, 4, 5))
    chekingMyNumbs3(0)
    println(chekingMyNumbsReturn3(0))
    println(divisibleByReturn(11))
    evenOdd3(3)
    println(evenOddReturn3(3))
    leap3(2000)
    println(leapReturn3(2000))
    alphabet2('g')
    println(alphabet2Return('z'))
    trash("Sunday")
    lowerUpper3('A')
    daysNNumbers(6)
    validTriangle(2, 2, 2)
    validTriangle(1, 3, 4)
    validTriangle(2, 2, 4)
    triangleV(1, 1, 1)
    square(4, 9)
    myFabulousDiscount(70)
    myGreatBonus(1000000, 1)
    age(10, 9, 9)
    println(sum2Numbs(3,2))
    sum2NumbsNoReturn(4,4)
    println(fourNumbs())
}

//Write a program to find the maximum between two numbers
//No Return
fun maxNumbers3(num1: Int, num2: Int) {
    if (num1 > num2) {
        println("$num1 is greater than $num2")
    } else if (num2 > num1) {
        println("$num2 is greater than $num1")
    } else if (num2 == num1) {
        println("$num2 and $num1 are equal")
    }
}

//Return
fun maxNumbReturn3(num1: Int, num2: Int): String {
    var maxNumber = ""
    if (num1 > num2) {
        maxNumber = "$num1 is greater than $num2"
    } else if (num2 > num1) {
        maxNumber = "$num2 is greater than $num1"
    } else if (num1 == num2) {
        maxNumber = "$num1 and $num2 are equal"
    }
    return maxNumber
}

//Write a program to find the maximum between three numbers
//No Return
fun maxThreeNumb3(num1: Int, num2: Int, num3: Int) {
    if (num1 > num2 && num1 > num3) {
        println("$num1 is greater")
    } else if (num2 > num1 && num2 > num3) {
        println("$num2 is greater")
    } else if (num3 > num1 && num3 > num2) {
        println("$num3 is greater")
    } else if (num1 == num2 && num3 < num1 && num3 < num2) {
        println("$num1 enad $num2 are greater than $num3")
    } else if (num1 == num2 && num3 > num1 && num3 > num2) {
        println("$num3 is greather than $num1 and $num2")
    } else if (num2 == num3 && num1 > num2 && num1 > num3) {
        println("$num1 is greater than $num2 and $num3")
    } else if (num2 == num3 && num1 < num2 && num1 < num3) {
        println("$num2 and $num3 are greater than $num1")
    } else if (num1 == num3 && num2 > num1 && num2 > num3) {
        println("$num2 is greater than $num1 and $num3")
    } else if (num1 == num3 && num2 < num1 && num2 < num3) {
        println("$num1 and $num3 are greater than $num2")
    } else if (num1 == num2 && num1 == num3) {
        println("$num1, $num2 and $num3 are equal")
    }
}

// Return
fun maxThreeNumbReturn3(num1: Int, num2: Int, num3: Int): String {
    var maxThreeNumbs = ""
    if (num1 > num2 && num1 > num3) {
        maxThreeNumbs = "$num1 is greater"
    } else if (num2 > num1 && num2 > num3) {
        maxThreeNumbs = "$num2 is greater"
    } else if (num3 > num1 && num3 > num2) {
        maxThreeNumbs = "$num3 is greater"
    } else if (num1 == num2 && num3 < num1 && num3 < num2) {
        maxThreeNumbs = "$num1 enad $num2 are greater than $num3"
    } else if (num1 == num2 && num3 > num1 && num3 > num2) {
        maxThreeNumbs = "$num3 is greather than $num1 and $num2"
    } else if (num2 == num3 && num1 > num2 && num1 > num3) {
        maxThreeNumbs = "$num1 is greater than $num2 and $num3"
    } else if (num2 == num3 && num1 < num2 && num1 < num3) {
        maxThreeNumbs = "$num2 and $num3 are greater than $num1"
    } else if (num1 == num3 && num2 > num1 && num2 > num3) {
        maxThreeNumbs = "$num2 is greater than $num1 and $num3"
    } else if (num1 == num3 && num2 < num1 && num2 < num3) {
        maxThreeNumbs = "$num1 and $num3 are greater than $num2"
    } else if (num1 == num2 && num1 == num3) {
        maxThreeNumbs = "$num1, $num2 and $num3 are equal"
    }
    return maxThreeNumbs
}

//Write a program to check whether a number is negative, positive, or zero
//No Return
fun chekingMyNumbs3(num1: Int) {
    if (num1 > 0) {
        println("$num1 is positive")
    } else if (num1 < 0) {
        println("$num1 is a negative number")
    } else if (num1 == 0) {
        println("$num1 is zero")
    }
}

// Return
fun chekingMyNumbsReturn3(num1: Int): String {
    var myThreeNumbs = ""
    if (num1 > 0) {
        myThreeNumbs = "$num1 is positive"
    } else if (num1 < 0) {
        myThreeNumbs = "$num1 is a negative number"
    } else if (num1 == 0) {
        myThreeNumbs = "$num1 is zero"
    }
    return myThreeNumbs
}

//Write a program to check whether a number is divisible by 5 and 11
//No return
fun dividibleBy(num1: Int) {
    if (num1 % 5 == 0 && num1 % 11 == 0) {
        println("$num1 is divisible by 5 and 11")
    } else {
        println("$num1 is not divisible by 5 and 11")
    }
}

// Return
fun divisibleByReturn(num1: Int): Boolean {
    var divisible5n11 = false
    if (num1 % 5 == 0 && num1 % 11 == 0) {
        divisible5n11 = true
    } else {
        divisible5n11
    }
    return divisible5n11

}

//Write a program to check whether a number is even or odd (Finished)
// No return
fun evenOdd3(num1: Int) {
    if (num1 % 2 == 0) {
        println("Even number")
    } else
        println("Odd Number")
}

// Return
fun evenOddReturn3(num1: Int): String {
    var evenOdd = ""
    if (num1 % 2 == 0) {
        evenOdd = "Even"
    } else {
        evenOdd = "Odd"
    }
    return evenOdd
}

//Write a program to check whether a year is a leap year
fun leap3(year: Int) {
    if (year > 1582) {
        if (year % 4 != 0) {
            println("Is a common year")
        } else if (year % 100 != 0) {
            println("is a leap year")
        } else if (year % 400 != 0) {
            println("Is a  common year")
        } else {
            println("$year is a leap year")
        }
    } else {
        println("Leap years started after 1582")
    }
}

//Return
fun leapReturn3(year: Int): String {
    var yearLeap = ""
    if (year > 1582) {
        if (year % 4 != 0) {
            yearLeap = "Is a common year"
        } else if (year % 100 != 0) {
            yearLeap = "is a leap year"
        } else if (year % 400 != 0) {
            yearLeap = "Is a  common year"
        } else {
            println("$year is a leap year")
        }
    } else {
        yearLeap = "Leap years started after 1582"
    }
    return yearLeap
}

//Write a program to check whether a character is alphabet or not (Finished)
//No return
fun alphabet2(letter: Char) {
    if (letter in 'a'..'z' || letter in 'A'..'Z') {
        println("$letter is a character in the alphabet")
    } else {
        println("This is not a character in the alphabet")
    }
}

//Return
fun alphabet2Return(letter: Char): String {
    var isACharacterAlphabet = ""
    if (letter in 'a'..'z' || letter in 'A'..'Z') {
        isACharacterAlphabet = "$letter is a character in the alphabet"
    } else {
        isACharacterAlphabet = "This is not a character in the alphabet"
    }
    return isACharacterAlphabet
}

//Your neighbor keeps forgetting what day the garbage gets picked up. You decide to create a small program to remind them when to take their garbage out.
//Create an if expression that checks if the value of isTuesday is true.
//Inside the if expression, create a println() statement that outputs "Take out the trash."

fun trash(day: String) {

    if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" ||
            day == "Friday" || day == "Saturday" || day == "Sunday" || day == "monday" ||
            day == "tuesday" || day == "wednesday" || day == "thursday" ||
            day == "friday" || day == "saturday" || day == "sunday") {
        if (day == "Tuesday" || day == "tuesday") {
            println("Take out the trash is $day")
        } else {
            println("You can't take out the trash on $day")
        }
    } else {
        println("This is not a day of the week")
    }
}


//Write a program to check whether a character is lowercase or uppercase
fun lowerUpper3(character1: Char) {
    if (character1 in 'a'..'z') {
        println("This character $character1 is lower case")
    } else if (character1 in 'A'..'Z') {
        println("This character $character1 is uppercase")
    } else {
        println("This is a different kind of character")
    }
}
//Write a program that receives the day number of the week and returns the name of the day corresponding to that number (1 - 7)

fun daysNNumbers(numDay: Int) {
    if (numDay == 1) {
        println(" $numDay. Monday")
    } else if (numDay == 2) {
        println(" $numDay. Tuesday")
    } else if (numDay == 3) {
        println(" $numDay. Wednesday")
    } else if (numDay == 4) {
        println(" $numDay. Thursday")
    } else if (numDay == 5) {
        println(" $numDay. Friday")
    } else if (numDay == 6) {
        println(" $numDay. Saturday")
    } else if (numDay == 7) {
        println(" $numDay. Sunday")
    } else {
        println("This is not a day")
    }

}


//Write a program that receives the angles of a triangle and returns a string which says whether the triangle is equilateral, isosceles, or scalene (Finished)

fun validTriangle(num1: Int, num2: Int, num3: Int) {
    if (num1 == num2 && num2 == num3) {
        println("This is a equilateral triangle")
    } else if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("This is a isosceles triangle ")
    } else if (num1 != num2 && num2 != num3 && num1 != num3) {
        println("This is a scalene triangle")
    }
}

//Write a program that receives the angles of a triangle and returns true if the triangle is valid
fun triangleV(num1: Int, num2: Int, num3: Int) {
    var isValid = true
    if (num1 > 0 && num2 > 0 && num3 > 0) {
        println(isValid)
    } else {
        println(!isValid)
    }
}

//Write a program that receives the height and width of a rectangle and tell whether it is square or not

fun square(width: Int, height: Int) {
    if (width == height) {
        println("Is a square")
    } else {
        println("is a rectangle")
    }
}
//Write a program that receives an integer value, if the value is greater than 1000 return the value minus the 10% discount ‘

fun myFabulousDiscount(value: Int) {
    var myValue1 = 0
    if (value > 1000) {
        myValue1 = value - ((value * 10) / 100)
        println(myValue1)
    } else {
        println("You don't get any discount")
    }
}


//A company decided to give a bonus of 5% to an employee if his/her year of service is more than 5 years. Ask users for their salary and year of service and print the net bonus amount.
fun myGreatBonus(salary: Int, years: Int) {
    var total = 0
    if (years >= 0 && years < 150) { //(years in 0..149)
        if (years > 5) {
            total = ((salary * 5) / 100)
            println(total)
        } else {
            println("You don't qualify for the bonus. See you when you have more than 5 years")
        }
    } else {
        println("Ingress a valid value")
    }
}

//A school has following rules for grading system: a. Below 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

fun myGreatGrades(mark: Int) {
    if (mark <= 25 && mark > 0) {
        println("grade: F")
    } else if (mark <= 45 && mark > 25) {
        println("Grade E")
    } else if (mark <= 50 && mark > 45) {
        println("Grade D")
    } else if (mark <= 60 && mark > 50) {
        println("Grade C")
    } else if (mark <= 80 && mark > 60) {
        println("Grade B")
    } else if (mark > 80 && mark <= 100) {
        println("Grade A")
    } else {
        println("introduce a number between 0 and 100")
    }

}

//Write a program that receives the age of 3 people and determine the oldest and the youngest among them.

fun age(p1: Int, p2: Int, p3: Int) {
    if (p1 < 150 && p2 < 150 && p3 < 150) {
        if (p1 > 0 && p2 > 0 && p3 > 0) {
            if (p1 > p2 && p2 > p3 && p1 > p3) {
                println("$p1 is the oldest and $p3 is the youngest")
            } else if (p2 > p1 && p2 > p3 && p1 > p3) {
                println("$p2 is the oldest and $p3 is the youngest")
            } else if (p2 > p1 && p2 > p3 && p3 > p1) {
                println("$p2 is the oldest and $p1 is the youngest")
            } else if (p3 > p1 && p3 > p2 && p2 > p1) {
                println("$p3 is the oldest and $p1 the youngest")
            } else if (p3 > p1 && p3 > p2 && p1 > p2) {
                println("$p3 is the oldest and $p2 is the youngest")
            } else if (p1 == p3 && p1 > p2 && p3 > p2) {
                println("p 1 and p 3 have the same age and are the oldest and person 2 with the age of $p2 is the youngest")
            } else if (p1 == p3 && p1 < p2 && p3 < p2) {
                println("person 1 and person 3 have the same age and are younger than person 2 with the age of $p2 ")
            } else if (p1 == p2 && p1 > p3 && p2 > p3) {
                println("person 1 and person 2 have the same age and are the oldest and person 3 with the age of $p3 is the youngest")
            } else if (p1 == p2 && p1 < p3 && p2 < p3) {
                println("person 1 and person 2 have the same age and are younger than person 3 with the age of $p3 ")
            } else if (p2 == p3 && p2 > p1 && p3 > p1) {
                println("person 2 and person 3 have the same age and are the oldest and person 1 with the age of $p1 is the youngest")
            } else if (p2 == p3 && p2 < p1 && p3 < p1) {
                println("person 2 and person 3 have the same age and are younger than person 3 with the age of $p1")
            } else if (p1 == p2 && p2 == p3 && p1 == p3) {
                println("All of them have the same age")
            }
        } else {
            println("Introduce a positive number ")
        }
    } else {
        println("Wooow There is a person that is way to old for this program!")
    }
}


    fun sum2Numbs(num1:Int, num2:Int):Int {
        var sum = num1 + num2
        return  sum
    }

    fun sum2NumbsNoReturn(num1: Int, num2: Int){
        println(num1 + num2)
    }

fun fourNumbs():Int {
    var sum1 = sum2Numbs(9, 9) + sum2Numbs(5, 5)
    var sum2 = sum2Numbs(3, 3) + sum2Numbs(5, 5)
    // var sum3 = sum2NumbsNoReturn(4,4) This is not possible because is a method without return I cannot sum its values because I can't use the function

    return sum2Numbs(sum1, sum2)
}

