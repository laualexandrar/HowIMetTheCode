package forLoops

fun main() {
    myFinalTriangle(5)
    print("\n")
    square(4)
    print("\n")
    emptySquare(10)
    print("\n")
    myRectagle1(2,3)
    print("\n")
    freePractice()
    print("\n")
    evenNumbers()
}

fun myFinalTriangle(limit:Int){

    var x = limit
    var y = 5
    for (loop in 1.. limit){
        for (line in x downTo 1){
            print("  ")
        }
        for (num in y downTo 1){
            if(num >= 5) {
                print("* ")
            }
        }
        for (cosa in y downTo 1){
            if(cosa > 5) {
                print("* ")
            }
        }
        x--
        y++
        print("\n")
    }
}

fun square(size: Int){
    for (row in 1..size){
        for(line in 1..size){
            print("x ")
        }
        print("\n")
    }
}

fun emptySquare(size: Int) {
    for (loop in 1..size){

        for(line in 1..size){
            if(loop == 1 || loop == size){
                print("C ")
            } else if(line == 1 || line == size){
                print("C ")
            } else print("  ")
        }
        print("\n")
    }
}

fun myRectagle1(height: Int, width: Int){
    for(loop in 1..height){
        for(num in 1..width){
            if(height != width){
                print("O ")
            }else {
                print("Are you trying to dra an square?")
        }
        }
        print("\n")
    }
}

fun freePractice(){
    for(block in 1..3){
        for(loop in 1..5){
            for(line in 1..5){
                if(line < 3 && loop != 1) {
                    print("_ ")
                } else if (block == 1 && loop == 1) {
                        print("& ")
                    } else if(block  == 2 && loop ==1 ||block  == 2 && loop ==3 || block  == 2 && loop ==5){
                    print("& & ")
                }  else {
                        print("& ")
                    }
            }
            print("\n")
        }
        print("\n")
    }
}

fun evenNumbers(){
    for (num in 1..19){
        if(num % 2 == 0){
            print("even")
        }
    }
}