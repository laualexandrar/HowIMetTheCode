package forLoops

fun main() {
    print("\n")
    myTriangleForReal(5)
    print("\n")
    myFirstSteps(5)
    print("\n")
    noSe()
    print("\n")
    finalTriangle(8)
    print("\n")
    mimi()
}

fun myTriangleForReal(height:Int){
    var char = '*'
    var spaceCount = "_ "
    var x = height

    for (row in 1..x) {
        for (column in x downTo 1) {
            print(spaceCount)
        }
        x--
        print(char)
        print("\n")
    }
}

fun myFirstSteps(limit:Int){

    for (line in 0..5){
        print("_ ")
    }
    print("\n")
    for (line in 0..4){
        print("_ ")
    }
    print("\n")
    for(line in 0..3){
        print("_ ")
    }
    print("\n")
    for (line in 0..2){
        print("_ ")
    }
    print("\n")
    for (line in 0..1){
        print("_ ")
    }
    print("\n")
    print("_ ")

    print("\n")


    var x = 5
    var p = 5
    for (loop in 1..x) {
        for (line in x downTo 2) {
            print("  ")
        }

        for( num in  p downTo 1){
            if (num >= 5) {
                print("* ")
            }
        }
        for (num in p downTo 1) {
            if(num > 5) {
                print("* ")
            }
        }
       p++
        x--
        print("\n")
    }
}

fun noSe() {
    var x = 5
    var p = 5
    for (loop in 1..x) {
            for (num in p downTo 1) {
                if(num >= 5) {
                    print("* ")
                }
            }
        p++
        x--
        print("\n")
    }
}

fun finalTriangle(limit: Int){

    var x = limit
    var p = 5
    for (loop in 1..x) {
        for (line in x downTo 2) { // aqui dibujo el largo del triangulo separado por espacios
            print("  ")
        }

        for( num in  p downTo 1){ //aqui dibujo mis asteriscos despues de los espacioos
            if (num >= 5) {
                print("* ")
            }
        }
        for (num in p downTo 1) { // aqui dibujo un triangulo despues de los asteriscos que ya tengo
            if(num > 5) {
                print("& ")
            }
        }
        p++
        x--
        print("\n")
    }
}

fun mimi(){
    var x = 5
    var p = 5
    for (loop in 1..x) {
        for (num in p downTo 1) { //aqui dibujo mis asteriscos despues de los espacioos
            if (num >= 5) {
                print("* ")
            }
        }
        p++
        print("\n")
    }

}
