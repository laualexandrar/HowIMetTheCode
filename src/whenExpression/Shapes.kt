package whenExpression

import kotlin.random.Random

fun main() {
    easyWhen()
    print("\n")
    shapes()
}

fun easyWhen(){

    val option = 3
    var randomOption = Random.nextInt(0,40)

    when (randomOption){
        in 1..10 -> print("This option is option 1 with the number $randomOption")
        in 11..20 -> print("This is option 2 with the number $randomOption")
        in 21..30 -> print("This is option 3 with the number $randomOption")
        else -> print("There's no option with the number: $randomOption")
    }
}

fun shapes() {
    var shapeOption = 3
    var shapeRandomOption = Random.nextInt(1, 6)
    when (shapeRandomOption) {
        1 -> {
            for (row in 1..6) {
                for (column in 1..6) {
                    if (row == 1 || row == 6) {
                        print("* ")
                    } else {
                        if (column == 1 || column == 6) {
                            print("* ")
                        } else {
                            print("  ")
                        }
                    }
                }
                print("\n")
            }
        }
        2 -> {
            var x = 5
            var p = 5
            for (loop in 1..x) {
                for (space in x downTo 2) {
                    print("  ")
                }
                for (asterisk in p downTo 1) {
                    if (asterisk >= 5) {
                        print("* ")
                    }
                }
                for (endAsterisk in p downTo 1) {
                    if (endAsterisk > 5) {
                        print("* ")
                    }
                }
                p++
                x--
                print("\n")
            }
        }
        3 -> {
            for (num in 1..7) {
                for (line in 1..15) {
                    if (num == 1 || num == 7) {
                        print("X ")
                    } else if (line != 1 && line != 15) {
                        print( "  ")
                    } else {
                        print("X ")
                    }
                }
                print("\n")
            }
        }
        else -> {
            print("Unknown option")
        }
    }
}

// var randomOptionShapers = 3//Random.nextInt(1,2)
//
//    when (randomOptionShapers) {
//        1 -> {
//            for (loop in 1..5) {
//                for (line in 1..5) {
//                    if(loop == 1 || loop == 5) {
//                        print("x ")
//                    }else if (line == 1 || line == )
//                }
//                print("\n")
//            }
//        }
//        2 -> {
//            var x = 7
//            var p = 5
//            for (loop in 1..x) {
//                for (line in x downTo 2) {
//                    print("  ")
//                }
//
//                for( num in  p downTo 1){
//                    if (num >= 5) {
//                        print("* ")
//                    }
//                }
//                for (num in p downTo 1) {
//                    if(num > 5) {
//                        print("* ")
//                    }
//                }
//                p++
//                x--
//                print("\n")
//            }
//        }
//        3 -> {
//            for(height in 1..6){
//                for(width in 1.. 10){
//                    if(height == 1 || height == 6) {
//                        print("% ")
//                    } else if(width == 1 || width == 10 ){
//                        print("* ")
//                    } else {
//                        print("  ")
//                    }
//                }
//                print("\n")
//            }
//        }
//
//        4-> print("unknown Option")
//    }