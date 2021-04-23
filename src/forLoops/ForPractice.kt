package forLoops

fun main() {
    activityOne()
    print("\n")
    secondAct()
    print("\n")
    thirdTime()
    print("fibonacci \n")
    fibonacci(5)
}

fun activityOne() {
    val numbers = mutableListOf(2, 5, 3, 4, 1)

    numbers.sort()
    numbers.reverse()

    for (number in numbers) {
        print("$number ")
    }
    print("\n")

    for (numb in numbers) {
        if (numb <= 4) {
            print("$numb ")
        }
    }
    print("\n")

    for (num in numbers) {
        if (num <= 3) {
            print("$num ")
        }
    }
    print("\n")

    for (nu in numbers) {
        if (nu <= 2) {
            print("$nu ")
        }
    }
    print("\n")

    for (n in numbers) {
        if (n <= 1) {
            print(n)
        }
    }
    print("\n")

    var mynum = 5

    while (mynum in 1..5) {
        print("\n")
        for (num in numbers) {
            if (num <= mynum) {
                print("$num ")
            }
        }
        mynum--
    }
}

// Second Activity

fun secondAct() {
    val myList = mutableListOf(10, 20, 30, 40, 50)
    myList.reverse()
    print(myList)
    print("\n")
    for (num in myList) {
    }
}

fun thirdTime() {
    var y = 5
    var x = 5
    for (number in y downTo 1) {
        for (num in x downTo 1) {
            print("$num ")
        }
        x--
        print("\n")
    }
}

fun fibonacci(limit: Int) {

    var x = 0
    var y = 1
    var z = 0
    print("1 ")

    for (number in 1..limit) {
        z = x + y
        x = y
        y = z
        print("$z ")
    }
}

fun fibonacciYON(num: Int) {
    var x = 0
    var y = 1
    var z = x + y
    var limit = num + 1

    for (number in 1..limit) {
        z = x + y
        x = y
        y = z
        if (num == z) {
        print("$num is one of the fibonacci numbers")
        } else {
            print("$num is no one of the fibonacci numbers")
        }
    }
}

