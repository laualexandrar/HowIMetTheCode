package conditionals

fun main() {
    println(maxNum(9, 9))
    maxNumNoReturn(4, 4)
    maxNumShort(56, 4)
    maxThreeNums(410, 48, 440)
    println(maxThreeNumWthReturn(40, 40, 40))
    checkingNumbers(0)
    checkingNumbersReturn(-1)
//    mathWithNumbers(10)
//    mathWithNumbers(110)
//    evenNum(5)
//    evenNumWthReturn(4)
//    leapYear(200)
//    println(leapYearReturn(2000))
//    alphabet('g')
//    takeOutGarbage(true)
//    takeOutGarbage(false)
//    lowerUpper('7')
//    lowerUpperReturn('0')
//    lowerUpperShort('D')
//    dayOfTheWeek(3)
//    println(dayOfTheWeekReturn(7))
//    triangle(4, 8, 3)
//    println(triangleReturn(6, 6, 6))
//    println(triangleReturnTrue(3, 3, 3))
//    println(triangleReturnTrue(3, 3, 3))
//    heightNWidth(3.4, 3.9)
//    println(heighNWidthReturn(7.8, 7.8))
//    discount(2000)
//    println(discountReturn(2000))
//    bonus(5000, 1)
//    println(bonusReturn(5000, 2))
//    schoolRules(60000)
//    println(schoolRulesReturn(80))
//    println(schoolRulesReduced(100))
    // Write a program that receives the age of 3 people and determine the oldest and the youngest among them.
    youngestOrOldest(149, 149, -149)
}

//Write a program to find the maximum between two numbers

//Method with return

fun maxNum(num1: Int, num2: Int): Int {

    var maxNumber = 0

    if (num1 > num2) {
        maxNumber = num1
    } else {
        maxNumber = num2
    }
    return maxNumber
}

//Method with no return

fun maxNumNoReturn(num1: Int, num2: Int) {
    if (num1 > num2) {
        println(num1)
    } else {
        println(num2)
    }
}
//another way to write the method with no return

fun maxNumShort(num1: Int, num2: Int) {
    println(if (num1 > num2) "$num1" else "'$num2")
}

//Write a program to find the maximum between three numbers
//Method with no return

fun maxThreeNums(num1: Int, num2: Int, num3: Int) {

    if (num1 > num2 && num1 > num3) {
        println("$num1 is greater than $num2 and $num3")
    } else if (num2 > num1 && num2 > num3) {
        println("$num2 is greater than $num1 and $num3")
    } else if (num3 > num1 && num3 > num2) {
        println("$num3 is greater than $num1 and $num2")
    } else if (num1 == num2 && num3 > num1 && num3 > num2) {
        println("$num3 is greater than $num1 and $num2")
    } else if (num1 == num2 && num3 < num1 && num3 < num2) {
        println("$num1 and $num2 are greater than $num3")
    } else if (num2 == num3 && num1 > num2 && num1 > num3) {
        println("$num1 is greater than $num2 and $num3")
    } else if (num2 == num3 && num1 < num2 && num1 < num3) {
        println("$num2 & $num3 are greather than $num1")
    } else if(num1 == num3 && num2 > num1 && num2 > num3){
        println("$num2 is greater than $num1 and $num2")
    }else if( num1 == num3 && num2< num1 && num2<num3){
        println("$num1 and $num3 are greater than $num2")
    }else if(num1==num2 && num2== num3 && num1 == num3){
        println("All the numbers are equal")
    }
}

//Method with return
fun maxThreeNumWthReturn(num1: Int, num2: Int, num3: Int): String {
    var biggestNumber = ""
    if (num1 > num2 && num1 > num3) {
        biggestNumber = "$num1 is greater than $num2 and $num3"
    } else if (num2 > num1 && num2 > num3) {
        biggestNumber = "$num2 is greater than $num1 and $num3"
    } else if (num3 > num1 && num3 > num2) {
        biggestNumber = "$num3 is greater than $num1 and $num2"
    } else if (num1 == num2 && num3 > num1 && num3 > num2) {
        biggestNumber = "$num3 is greater than $num1 and $num2"
    } else if (num1 == num2 && num3 < num1 && num3 < num2) {
        biggestNumber = "$num1 and $num2 are greater than $num3"
    } else if (num2 == num3 && num1 > num2 && num1 > num3) {
        biggestNumber = "$num1 is greater than $num2 and $num3"
    } else if (num2 == num3 && num1 < num2 && num1 < num3) {
        biggestNumber = "$num2 & $num3 are greather than $num1"
    } else if (num1 == num3 && num2 > num1 && num2 > num3) {
        biggestNumber = "$num2 is greater than $num1 and $num2"
    } else if (num1 == num3 && num2 < num1 && num2 < num3) {
        biggestNumber = "$num1 and $num3 are greater than $num2"
    } else if (num1 == num2 && num2 == num3 && num1 == num3) {
        biggestNumber = "All the numbers are equal"
    }

    return biggestNumber

}

//Write a program to check whether a number is negative, positive, or zero
//Method with no return
fun checkingNumbers(num1: Int) {
    if (num1 > 0) {
        println("$num1 is a positive number")
    } else if (num1 < 0) {
        println("$num1 is a negative number")
    } else if (num1 == 0) {
        println("$num1 is zero")
    }

}
// Method with return

fun checkingNumbersReturn(num1: Int): Int {

    var numberChecked = 0
    if (num1 > 0) {
        numberChecked = num1
        println("$numberChecked is a positive number")
    } else if (num1 < 0) {
        numberChecked = num1
        println("$numberChecked is a negative number")
    } else if (num1 == 0) {
        numberChecked = num1
        println("$numberChecked is zero")
    }
    return numberChecked
}

//Write a program to check whether a number is divisible by 5 and 11

//Method no Return
fun mathWithNumbers(num1: Int) {
    if (num1 % 5 == 0 && num1 % 11 == 0) { //55
        println("$num1 is divisible by 5 and 11")
    } else {
        println("$num1 is not divisible by 5 and 11")
    }
}

//Method with return
fun mathWithNumbersWthRetun(num1: Int): Int {
    var divisible = 0
    if (num1 % 5 == 0 && num1 % 11 == 0) {
        divisible = num1
        println("$num1 is divisible by 5 and 11")
    } else {
        divisible = num1
        println("$num1 is not divisible by 5 and 11")
    }

    return divisible
}

//Write a program to check whether a number is even or odd
//Method with no return

fun evenNum(num1: Int) {
    if (num1 % 2 == 0) {
        println("$num1 is even")
    } else {
        println("$num1 is odd")
    }
}

fun evenNumWthReturn(num1: Int): Int {
    var evenNumb = 0
    if (num1 % 2 == 0) {
        evenNumb = num1
        println("$num1 is even")
    } else {
        evenNumb = num1
        println("$num1 is odd")
    }
    return evenNumb
}

// Write a program to check whether a year is a leap year

//method with no return

fun leapYear(year: Int) {
    if (year >= 1582) {
        if (year % 4 != 0) { //4 == 0 is a leap 4 != 0 is not leap
            println("$year is a common year")
        } else if (year % 100 != 0) { // 100 == 0 is not a leap 100 != 0 is leap
            println("$year is a leap year")
        } else if (year % 400 != 0) { //400 == 0 is a leap 400 != 0 is not leap
            println("$year is a common year")
        } else {
            println("$year is a leap year")
        }
    } else {
        println("leap year start from the year 1582")
    }
}

// method with return

fun leapYearReturn(year: Int): String {
    var stringAnswer = ""
    if (year >= 1582) {
        if (year % 4 != 0) { //4 == 0 is a leap 4 != 0 is not leap
            stringAnswer = "$year is a common year"

        } else if (year % 100 != 0) { // 100 == 0 is not a leap 100 != 0 is leap
            stringAnswer = "$year is a leap year"
        } else if (year % 400 != 0) { //400 == 0 is a leap 400 != 0 is not leap
            stringAnswer = "$year is a common year"
        } else {
            stringAnswer = "$year is a leap year"
        }
    } else {
        stringAnswer = "leap year start from the year 1582"
    }
    return stringAnswer

}


// Write a program to check whether a character is alphabet or not

//Method no return

fun alphabet(something: Char) {
    if (something >= 'a' && something <= 'z' || something >= 'A' && something <= 'Z') {
        println("$something is in the alphabet")
    }
}

// other
fun takeOutGarbage(isTuesday: Boolean) {
    if (isTuesday) {
        println("Take out the garbage.")
    } else {
        println("Is not Tuesday you can't take out the garbage ")
    }
}

//Write a program to check whether a character is lowercase or uppercase

fun lowerUpper(letter: Char) {
    if (letter >= 'a' && letter <= 'z') {
        println("$letter is lowercase")
    } else if (letter >= 'A' && letter <= 'Z') {
        println("$letter is uppercase")
    } else {
        println("This is not a character")
    }
}

fun lowerUpperReturn(letter: Char): Char {
    var upperOrLower: Char
    if (letter >= 'a' && letter <= 'z') { //another way to write if(letter in 'a'..'z'){
        upperOrLower = letter
        println("$upperOrLower is lowercase")
    } else if (letter >= 'A' && letter <= 'Z') {

        upperOrLower = letter
        println("$upperOrLower is uppercase")
    } else {
        upperOrLower = letter
        println("This is not a character")
    }
    return upperOrLower

}

fun lowerUpperShort(letter: Char) {
    if (letter in 'a'..'z') {
        println("$letter is lowercase")
    } else if (letter in 'A'..'Z') {
        println("$letter is uppercase")
    } else {
        println("This is not a char")
    }
}

//Write a program that receives the day number of the week and returns the name of the day corresponding to that number (1 - 7)

fun dayOfTheWeek(number: Int) {
    if (number == 1) {
        println("Monday")
    } else if (number == 2) {
        println("Tuesday")
    } else if (number == 3) {
        println("Wednesday")
    } else if (number == 4) {
        println("Thursday")
    } else if (number == 5) {
        println("Friday")
    } else if (number == 6) {
        println("Saturday")
    } else if (number == 7) {
        println(" Sunday")
    } else {
        println("You had to chose a number between 1 to 7")
    }
}

fun dayOfTheWeekReturn(number: Int): String {
    var day = ""
    if (number == 1) {
        day = "Monday"
    } else if (number == 2) {
        day = "Tuesday"
    } else if (number == 3) {
        day = "Wednesday"
    } else if (number == 4) {
        day = "Thursday"
    } else if (number == 5) {
        day = "Friday"
    } else if (number == 6) {
        day = "Saturday"
    } else if (number == 7) {
        day = "Sunday"
    } else {
        day = "You had a wrong number"
    }
    return day
}

//Write a program that receives the angles of a triangle and returns a string which says whether the triangle is equilateral, isosceles, or scalene

fun triangle(num1: Int, num2: Int, num3: Int) {
    if (num1 == num2 && num1 == num3 && num2 == num3) {
        println("This is a equilateral triangle, three equal sides")
    } else if ((num1 == num2 && num1 != num3) || (num1 == num3 && num1 != num2) || (num2 == num3 && num2 != num1)
            || (num2 == num1 && num2 != num3) || (num3 == num1 && num3 != num2) || (num3 == num2 && num3 != num1)) {
        println("This is a Isosceles Triangle, two equal sides")
    } else if ((num1 != num2 && num1 != num3) && (num2 != num3)) {
        println("This is a Scalene Triangle, no equal sides")
    }
}

fun triangleReturn(num1: Int, num2: Int, num3: Int): String {
    var typeOfTriangle = ""
    if (num1 == num2 && num1 == num3 && num2 == num3) {
        typeOfTriangle = "This is a equilateral triangle, three equal sides"
    } else if ((num1 == num2 && num1 != num3) || (num1 == num3 && num1 != num2) || (num2 == num3 && num2 != num1)
            || (num2 == num1 && num2 != num3) || (num3 == num1 && num3 != num2) || (num3 == num2 && num3 != num1)) {
        typeOfTriangle = "This is a Isosceles Triangle, Two equal sides"
    } else if ((num1 != num2 && num1 != num3) && (num2 != num3)) {
        typeOfTriangle = "This is a Scalene Triangle, No equal sides"
    }
    return typeOfTriangle
}

//Write a program that receives the angles of a triangle and returns true if the triangle is valid
fun triangleReturnTrue(num1: Int, num2: Int, num3: Int): Boolean {
    var trueTriangle: Boolean = false
    if (num1 == num2 && num1 == num3 && num2 == num3) {
        return true
    }

    return trueTriangle
}
// Write a program that receives the height and width of a rectangle and tell whether it is square or not

fun heightNWidth(height: Double, width: Double) {
    if (height == width) {
        println("is a square")
    } else {
        println("is a rectangle")
    }
}

fun heighNWidthReturn(height: Double, width: Double): String {
    var isASquareOrRectangle = ""
    if (height == width) {
        isASquareOrRectangle = "Is a square"
    } else {
        isASquareOrRectangle = "is a rectangle"
    }
    return isASquareOrRectangle
}

//Write a program that receives an integer value, if the value is greater than 1000 return the value minus the 10% discount ‘

fun discount(num1: Int) {
    if (num1 > 1000) {
        var valueDiscount = (num1 - ((num1 * 10) / 100))
        println(valueDiscount)
    } else {
        println("To get the discount you have to have a number greater than 1000 ")
    }
}

fun discountReturn(num1: Int): Int {
    var totalDiscount = 0
    if (num1 > 1000) {
        totalDiscount = num1 - ((num1 * 10) / 100)
    } else {
        totalDiscount
    }
    return totalDiscount
}

// A company decided to give a bonus of 5% to an employee if his/her year of service is more than 5 years. Ask users for their salary and year of service and print the net bonus amount.

fun bonus(salary: Int, years: Int) {
    var bonus = 0
    if (years in 0..100) {
        if (years > 5) {
            bonus = ((salary * 5) / 100)
            println(bonus)
        } else {
            println("Sorry, We are giving the 5% of bonus just if to employees that have more than 5 years working with the company")
        }
    } else
        println("Introduce a number between 1 to 100")
}

fun bonusReturn(salary: Int, years: Int): Int {
    var bonus = 0
    //if (years in 0..100) {
    if (years > 5) {
        bonus = ((salary * 5) / 100)
    } else {
        bonus
    }
//    } else {
//        println("Introduce a number between 1 to 100") can I do this or is enough with the 0

    return bonus
}
// A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

fun schoolRules(mark: Int) {
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

fun schoolRulesReturn(mark: Int): String {
    var grade = ""
    if (mark <= 25 && mark > 0) {
        grade = "grade: F"
    } else if (mark <= 45 && mark > 25) {
        grade = "Grade E"
    } else if (mark <= 50 && mark > 45) {
        grade = "Grade D"
    } else if (mark <= 60 && mark > 50) {
        grade = "Grade C"
    } else if (mark <= 80 && mark > 60) {
        grade = "Grade B"
    } else if (mark > 80 && mark <= 100) {
        grade = "Grade A"
    } else {
        grade = "introduce a number between 0 and 100"
    }
    return grade
}

// another way to write this code

fun schoolRulesReduced(mark: Int): String {
    var grade = ""
    if (mark in 0..25) {
        grade = "grade: F"
    } else if (mark in 26..45) {
        grade = "grade E"
    } else if (mark in 46..50) {
        grade = "grade D"
    } else if (mark in 51..60) {
        grade = "grade C"
    } else if (mark in 60..80) {
        grade = "grade B"
    } else if (mark in 81..100) {
        grade = "grade A"
    } else {
        grade = "Grade no valid"
    }
    return grade
}

// Write a program that receives the age of 3 people and determine the oldest and the youngest among them.

fun youngestOrOldest(person1: Int, person2: Int, person3: Int) {
    if (person1 < 150 && person2 < 150 && person3 < 150) {
        if (person1 > 0 && person2 > 0 && person3 > 0) {
            if (person1 > person2 && person1 > person3 && person2 > person3) {
                println("person 1 with the age of $person1 is the oldest and person 3 with the age of $person3 is the youngest")
            } else if (person2 > person1 && person2 > person3 && person1 > person3) {
                println("person 2 with the age of $person2 is the oldest and person 3 with the age of $person3 is the youngest")
            } else if (person3 > person2 && person3 > person1 && person2 > person1) {
                println("person 3 with the age of $person3 is the oldest and person 1 with the age of $person1 is the youngest")
            } else if (person1 > person3 && person1 > person2 && person3 > person2) {
                println("person 1 with the age of $person1 is the oldest and person 2 with the age of $person2 is the youngest")
            } else if (person2 > person3 && person2 > person1 && person3 > person1) {
                println("person 2 with the age of $person2 is the oldest and person 1 with the age of $person1 is the youngest")
            } else if (person3 > person1 && person3 > person2 && person1 > person2) {
                println("person 3 with the age of $person3 is the oldest and person 2 with the age of $person2 is the youngest")
            } else if (person1 == person3 && person1 > person2 && person3 > person2) {
                println("person 1 and person 3 have the same age and are the oldest and person 2 with the age of $person2 is the youngest")
            } else if (person1 == person3 && person1 < person2 && person3 < person2) {
                println("person 1 and person 3 have the same age and are younger than person 2 with the age of $person2 ")
            } else if (person1 == person2 && person1 > person3 && person2 > person3) {
                println("person 1 and person 2 have the same age and are the oldest and person 3 with the age of $person3 is the youngest")
            } else if (person1 == person2 && person1 < person3 && person2 < person3) {
                println("person 1 and person 2 have the same age and are younger than person 3 with the age of $person3 ")
            } else if (person2 == person3 && person2 > person1 && person3 > person1) {
                println("person 2 and person 3 have the same age and are the oldest and person 1 with the age of $person1 is the youngest")
            } else if (person2 == person3 && person2 < person1 && person3 < person1) {
                println("person 2 and person 3 have the same age and are younger than person 3 with the age of $person1")
            } else if (person1 == person2 && person2 == person3 && person1 == person3) {
                println("All of them have the same age")
            }
        } else {
            println("Introduce a positive number ")
        }
    } else {
        println("Wooow There is a person that is way to old for this program!")
    }

}