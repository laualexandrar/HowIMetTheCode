package forLoops

fun main() {
    forBook()
    print("\n")
    myPractice1()
    print("\n")
    myPractice3()
    print("\n")
    myPractice4()
    print("\n")
    mySquare(5)
    print("\n")
    myEmptySquare(6)
    print("\n")
    practicingAgain()
    print("\n")
    myPracticeAgain2()
    print("\n")
    myPracticeAgain3()
    print("\n")
    myCuteSquare(13)
    print("\n")
    myCuteEmptySquare(20)
    print("\n")
    myRectangle()
    print("\n")
    myEmptyRectangle()
    print("\n")
    myCustomizedRectangle(10, 15)
    print("\n")
    myTriangle2()
    print("\n")
    myEquilateralTriangle()
    print("\n")
    oddNumbers()
}


fun forBook() {
    var x = 0
    var y = 20
    for (number in 1..3) {
        for (num in 4 downTo 2) {
            x = x + y
            y = x - 7
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")
}

fun myPractice1() {
    var myList3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    var temp = 5
    for (loop in 1..5) {
        for (num in myList3) {
            if (num <= myList3[temp - 1]) {

                print(" ${num}")
            }
        }
        temp--

        print("\n")
    }
}

fun myPractice3() {
    var myList3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    var temp = 5
    for (loop in 1..5) {
        for (num in myList3) {
            if (num >= myList3[temp - 1]) {

                print(" ${num}")
            }
        }
        temp--

        print("\n")
    }
}

fun myPractice4() {
    var myList3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    var temp = 0
    for (loop in 1..5) {
        for (num in myList3) {
            if (num >= myList3[temp]) {

                print(" ${num}")
            }
        }
        temp++

        print("\n")
    }
}

fun mySquare(limit: Int) {

    println("Please Write one number from 1 to 15")
    var myChar = '*'

    if (limit <= 15 && limit > 2) {
        for (row in 1..limit) {

            for (numb in 1..limit) {

                print("$myChar ")

            }
            print("\n")
        }
    } else {
        println("You had to select a numbert between 2 and 15")
    }

}

fun myEmptySquare(limit: Int) {
    var myAsterisk = '*'
    if (limit <= 15 && limit >= 1) {
        for (row in 1..limit) {

            if (row == 1 || row == limit) {
                for (asterisk in 1..limit) {
                    print("$myAsterisk ")
                }
                print("\n")
            } else {
                for (asterisk in 1..limit) {
                    print(" ")
                }
            }
        }
    } else {
        print("You have to select a number between 1 and 15")
    }

}

fun practicingAgain() {
    var myCuteList = mutableListOf<Int>(1, 2, 3, 4, 5)
    var temp = 5
    for (loop in 1..5) {
        for (num in myCuteList) {
            if (num <= myCuteList[temp - 1]) {
                print(num)
            }

        }
        temp--
        print("\n")
    }
}

fun myPracticeAgain2() {
    var myList1 = mutableListOf(1, 2, 3, 4, 5)
    var temp = 5
    for (loop in 1..5) {
        for (num in myList1) {
            if (num >= myList1[temp - 1]) {
                print(num)
            }
        }
        temp--
        print("\n")
    }
}

fun myPracticeAgain3() {
    var temp = 1
    for (loop in 1..5) {
        for (num in 1..5) {
            if (num >= temp) {
                print(num)
            }
        }
        print("\n")
        temp++
    }
}

fun myCuteSquare(limit: Int) {
    var char1 = 'x'
    println("Please write a number between 1 and 50")
    if (limit in 0..20) {
        for (num in 1..limit) {
            for (line in 1..limit) {
                print(char1)
            }
            print("\n")
        }
    } else {
        print("this number is not between 1 and 15")
    }
}

fun myCuteEmptySquare(limit: Int) {
    var chart4 = 'x'
    if (limit in 1..35) {
        for (loop in 1..limit) {
            for (line in 1..limit) {
                if (loop == 1 || loop == limit) {
                    print(chart4)
                } else {
                    if (line == 1 || line == limit) {
                        print("$chart4 ")
                    } else {
                        print(" ")
                    }
                }

            }
            print("\n")
        }
    } else {
        print("You have to write a number between 1 and 35")
    }
}

//Draw a rectangle 40x5 using * (asterisk)

fun myRectangle() {
    var asterisk2 = '*'
    for (loop in 1..5) {
        for (line in 1..40) {
            print("$asterisk2 ")
        }
        print("\n")
    }
}

fun myEmptyRectangle() {
    var asterisk3 = '*'
    for (loop in 1..5) {
        for (line in 1..40) {
            if (loop == 1 || loop == 5) {
                print("$asterisk3 ")
            } else if (line == 1 || line == 40) {
                print("$asterisk3 ")
            } else {
                print("  ")
            }

        }
        print("\n")
    }
}

fun myCustomizedRectangle(height: Int, width: Int) {
    var char5 = '*'
    if (width != height) {
        for (loop in 1..width) {
            for (line in 1..height) {
                print("* ")
            }
            print("\n")
        }
    } else {
        print("Is a triangle! Are you trying to draw an square?")
    }
}

// draw a triangle
fun myTriangle() {
    for (loop in 1..5) {
        if (loop == 1) {
            for (line in 1..5) {
                if (line == 3) {
                    print("*")
                } else {
                    print(" ")
                }
            }
        }
    }
}

fun myTriangle2() {
    var limit = 10
    var width = 1

    var char = '*'
    for (loop in 1..limit) {
        for (line in 1..width) {
            print(char)
        }
        print("\n")
        limit++
        width++
    }
}

fun myEquilateralTriangle() {
    var char = '*'
    for (height in 1..4) {
        for(width in 1..10) {
            print(char)
        }
        print("\n")
    }

}


fun oddNumbers(){
    for (num in 1..10){
        if(num%2 != 0){
            println(num)
        }
    }
}



//for (line in 1..width) {
//    if (loop == 1) {
//        if (line == (width / 2)) {
//            print(char)
//        } else {
//            print(" ")
//        }
//    } else if(loop == 2){
//        if (line == (width / 2) || line == ((width / 2) +1) || line == ((width / 2) -1)) {
//            print(char)
//        } else {
//            print(" ")
//        }
//    } else if(loop == 3){
//        if (line == (width / 2) || line == ((width / 2) +1) || line == ((width / 2) -1)|| line == ((width / 2) +2) || line == ((width / 2) -2)) {
//            print(char)
//        } else {
//            print(" ")
//        }
//    } else if(loop == 4){
//        if (line == (width / 2) || line == ((width / 2) +1) || line == ((width / 2) -1)|| line == ((width / 2) +2) || line == ((width / 2) -2) || line == ((width / 2) +3) || line == ((width / 2) -3)) {
//            print(char)
//        } else {
//            print(" ")
//        }
//    }
////
//}
//print("\n")
//
//}
