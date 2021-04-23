package conditionals

import aboutfiles.MyClass
import aboutfiles.myGradesWithoutReturn


fun main() {
    val isTheComputerPink = true
    val hasTheComputerStickers = true
    val isTheComputerFullyCharged = false
    val isTheComputerOpen = true
    val isTheComputerPlayingAVideo = false
    val hasTheComputer3Cameras = false


    if (isTheComputerPink && hasTheComputerStickers) {
        println("Is my computer!")
    }

    if (!isTheComputerFullyCharged) {
        println("No the computer is not fully charged")
    }

    if (!isTheComputerFullyCharged && isTheComputerOpen && !isTheComputerPlayingAVideo) {
        println("Plase before close the computer and putting it to charge, please open that video")
    }

    if (!isTheComputerPink || !hasTheComputer3Cameras) {
        println("That computer is not mine! it has 3 cameras and mine just has one")
    }

    if (hasTheComputerStickers && !hasTheComputer3Cameras) {
        println("That is my computer")
    }

    //book("Hi", "1989", 3) // calling a method from another file
    myGradesWithoutReturn(3, 5, 2)// calling my method from another file located in another package

    var callingAClass = MyClass() //creating an object with the class where I want to call their methods and variables
    callingAClass.numberOfCharts
    callingAClass.numberOfNotes
    callingAClass.numeritos(3, 6)



}