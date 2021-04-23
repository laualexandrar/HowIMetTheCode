package whenExpression

import kotlin.random.Random

fun main() {
    shapesV2()
}

fun shapesV2() {

    var option = 3
    print("\nWelcome")

    do {
        val options: String = """
            1. Draw an empty square
            2. Draw a triangle
            3. Draw a Rectangle
            4. Exit 
        """.trimIndent()

        println("\n$options")
        print("Please select one of the options :\n")
        print("\n")

        var myInput = readLine()!!.toInt()

        when (myInput) {
            1 -> {
                var number: Int?
                var squareOptions = """
                    Which square do you want? 
                    1. filled 
                    2. Empty
                    
                """.trimIndent()
                print(squareOptions)
                print("\n")

                number = readLine()?.toInt()

                when (number) {
                    1 -> {
                        for (loop in 1..5) {
                            for (line in 1..5) {
                                print("* ")
                            }
                            print("\n")
                        }
                    }
                    2 -> {
                        for (loop in 1..5) {
                            for (line in 1..5) {
                                if (loop == 1 || loop == 5) {
                                    print("* ")
                                } else if (line == 1 || line == 5) {
                                    print("* ")
                                } else {
                                    print("  ")
                                }
                            }
                            print("\n")
                        }
                    }
                }

            }
            2 -> {
                var number: Int?
                var triangleOptions = """
                    Which triangle do you want? 
                    1. Do you want to give us the height? write 1 
                    2. Would you like a random triangle? write 2
                    
                """.trimIndent()

                print(triangleOptions)
                print("\n")

                number = readLine()?.toInt()
                when (number) {
                    1 -> {
                        print(" please ingress height between 3 to 15\n")
                        print("\n")
                        var height = readLine()?.toInt()
                        var y = 5
                        for (loop in 1..height!!) {
                            for (space in height downTo 2) {
                                print("  ")
                            }
                            for (asterisk in y downTo 1) {
                                if (asterisk >= 5) {
                                    print("* ")
                                }
                            }
                            for (secondTriangle in y downTo 1) {
                                if (secondTriangle > 5) {
                                    print("* ")
                                }
                            }
                            y++
                            height--
                            print("\n")
                        }
                    }
                    2 -> {
                        var x = Random.nextInt(1, 20)
                        var y = 5
                        for (loop in 1..x) {
                            for (line in x downTo 2) {
                                print("  ")
                            }
                            for (asterisk1 in y downTo 1) {
                                if (asterisk1 >= 5) {
                                    print("$ ")
                                }
                            }
                            for (asterisk2 in y downTo 1) {
                                if (asterisk2 > 5) {
                                    print("$ ")
                                }
                            }
                            x--
                            y++
                            print("\n")
                        }
                    }
                }
            }
            3 -> {

                var number: Int?
                var rectangleOptions = """
                    1. Would you like a random rectangle? write 1
                    2. Would you like to draw the rectangle? write 2
                """.trimIndent()

                print(rectangleOptions)
                print("\n")
                number = readLine()?.toInt()

                when (number) {
                    1 -> {
                        var randomRectangleHeight = Random.nextInt(1, 25)
                        var randomRectangleWidth = Random.nextInt(1, 25)

                        for (loop in 1..randomRectangleHeight) {
                            for (line in 1..randomRectangleWidth) {
                                if (loop == 1 || loop == randomRectangleHeight) {
                                    print("* ")
                                } else if (line == 1 || line == randomRectangleWidth) {
                                    print("* ")
                                } else {
                                    print("  ")
                                }
                            }
                            print("\n")
                        }
                    }
                    2 -> {
                        print("please write the width that you want for the rectangle")
                        print("\n")
                        var width = readLine()?.toInt()
                        print("\n")
                        print("please write the height that you want for the rectangle")
                        print("\n")
                        var height = readLine()?.toInt()
                        print("\n")

                        for (num in 1..width!!) {
                            for (line in 1..height!!) {
                                if (num == 1 || num == width) {
                                    print("* ")
                                } else if (line == 1 || line == height) {
                                    print("* ")
                                } else {
                                    print("  ")
                                }
                            }
                            print("\n")
                        }
                    }
                }
            }
            4 -> print("\nThanks for playing!")
        }

    } while (myInput <= 3 && myInput > 0)
}

