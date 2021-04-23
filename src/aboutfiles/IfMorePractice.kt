package aboutfiles

class Pinguinitos{
    fun penguinsData (babiesNames: String, years: Int){
        var penguinsColor: String
        if(babiesNames == "Pepi" && years == 5){
            println("baby $babiesNames is $years years old")
        }
    }
}

fun main() {
    var penguin = Pinguinitos()
    penguin.penguinsData("Pepi", 5)

    var animalitosFun = IfMorePractice()
    animalitosFun.animalitos()

    song("It's my life", "Bon Jovi", 3, true, "Pop")

}
class IfMorePractice {

    fun animalitos(){
        val myClassPinguinitos = Pinguinitos ()
        myClassPinguinitos.penguinsData("Pepi", 5)
    }

}

fun song(songName: String, singer: String, length: Int, playing: Boolean, genre: String){
    if (songName == "Love me" || songName == "It's my Life" && length == 3 ||
            length == 4 && singer == "Adele" || singer == "Bon Jovi" && playing && genre == "Pop") {
        println("$songName is a song by $singer with a length $length and genre $genre ")
    }

    if (songName == "Love me" && singer == "Adele"){
        println("$singer sings $songName")
    }

    if (songName == "It's my life" && singer == "Bon Jovi"){
        println("$singer sings $songName")
    }
}

