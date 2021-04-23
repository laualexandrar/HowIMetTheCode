package conditionsAndLoops

import java.time.Year

fun main() {
    paint("Yellow", "Blue")
    paint2("Blue", "Red")
    paint2("Red", "Yellow")
    paint2("Red", "yellow") // it doesn't compile because of the lowerCase
    paint2("Orange", "Yellow") // it doesn't compile because orange is not an option
    paint2("Blue", "Yellow")
    sumPractice(1, 3, 4)
    booleanReturn("Laura")
    book("Po", "1989", 3)
    book("Po", "1988", 19)
    book("Hi", "1989", 3)
    book("Po", "1989", 77)
    math(5,5)
}

fun paint(color1: String, color2: String) {

    val resultColor = "green"

    if (color1 == "Yellow" && color2 == "Blue") {
        println("If I mix $color1 and $color2 I get $resultColor")
    } else {
        println("Incorrect answer")
    }

}

fun paint2(color1: String, color2: String) {


    if (color1 == "Yellow" && color2 == "Blue" || color1 == "Blue" && color2 == "Yellow") {
        // val resultColor = "green" I can't do this
        println("If I mix $color1 and $color2 I get green")
    }

    if (color1 == "Yellow" && color2 == "Red" || color1 == "Red" && color2 == "Yellow") {

        println("If I mix $color1 and $color2 I get orange")
    }

    if (color1 == "Red" && color2 == "Blue" || color1 == "Blue" && color2 == "Red") {
        // val resultColor = "green" I can't do this
        println("If I mix $color1 and $color2 I get purple")
    }
}

fun sumPractice(num1: Int, num2: Int, num3: Int) {
    if (num1 == 1 && num2 == 3 && num3 == 4) {
        println(num1 + num2 + num3)
    }
}

fun booleanReturn(name: String): Boolean {
    val isSpyroGray = false

    if (!isSpyroGray) {
        println("You are right $name!")
    }
    return isSpyroGray
}

fun book(title: String, year: String, numberOfPages: Int) {
    if ((title == "Hi" && year != "1988" && numberOfPages == 3) ||
            (title == "Po" && year == "1988" && numberOfPages == 19)) {
        println("That's my book!")
    }

    if (title == "Hi" || year != "1988" && numberOfPages == 3 && title == "Po") {
        println("Yes tou are right! that's again my book")
    }

}

fun math (numerito1: Int, numerito: Int):Int {
    val sumNumber = 2
    if (numerito1 == numerito){
        val total = sumNumber + 2
        println(total)

    }
    return sumNumber// cuando retorno este numero en esta funcion cual es su proposito. Trate de hacer una operacion matematica al frente y funciono

}

