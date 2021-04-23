package forLoops

fun main() {
    rectangleBoolean(false)
    println("\n")
    rectangleBooleanFor(5, true)

}

fun rectangleBoolean(answer: Boolean) {

    if (answer == true) {
        print("********")

        print("\n*      *")
        print("\n*      *")
        print("\n********")
    } else {
        print("********")
        print("\n********")
        print("\n********")
        print("\n********")
    }

}

fun rectangleBooleanFor(limit: Int, word: Boolean) {

    for (row in 1..limit) {
        if (word == false) {
            print("\n********")
        } else {
            if (row == 1 || row == limit) {
                print("\n********")

            } else {
                print("\n*      *")
            }
        }
    }
}

/**
 * Exercises.
 *
 * 0. Draw a square (filled)
 * 1. Draw a rectangle 40x5 using * (asterisk)
 * 1.5 Draw an empty square, just the sides.
 * 2. Draw the same rectangle but empty, just the sides.
 * 3. Create a method that allows to draw a rectangle with custom width and height (Filled rectangle not empty)
 * 4. Draw a triangle.
 */


fun squareFor() {


    print("*")


}

//fun squareFor(limit:Int, answer: Boolean)
//    for (row in 1..limit) {
//        //var  vecesPrintAsterisk = limit
//        print("*")
//    }