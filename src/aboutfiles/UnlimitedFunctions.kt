package aboutfiles

fun main() {
    println(universityTitle("Laura","Ingeniera Industrial"))
    universityTitleNoReturn("Camilo", "Ingeniero de Sistemas")
    println(universityTitleNoReturn("Patricia", "Medicina")) /// here I get a kotlin.unit becasue I am calling a method without return
    universityTitle("Natalia", "Ingeniera Quimica") //here I get nothing because I am calling a method that doesn't print anything
    val myTitle = universityTitle("Daniel", "Software engineer")
    println(myTitle)
    println(catNames("Molly"))
    dogNames("Firulais")
    noParameter()
    x = 1
    y = 2
    println(otherParameters(x, y)) // imprimiendolo si
    otherParameters(3,5) // si no lo imprimo no me sale nada
    val catName = catNames("pepita")
    println(catName)
    println("$catName, she is my favorite friend in the whole world")
}
//I am going to add the university title
fun universityTitle(name:String, title:String):String {
    var uTitle = "$name, $title de la Universidad El Bosque"
    return  uTitle
}

fun universityTitleNoReturn(name:String, title:String){
    val UTitle2 = "$name, $title de la Universidad El Bosque"
    println(UTitle2)
}

fun catNames (name: String):String {
    var nameMeaning =  "$name is a strong cat"
    return nameMeaning
}

fun dogNames (name: String){
    var nameMeaning =  "$name is a strong dog"
    println(nameMeaning)

}

fun noParameter (){
    x = 2
    y = 3
    z = x + y
    println(z)
}

fun otherParameters(int1: Int, int2 : Int): Int{
    var total = int1 + int2
    return total
    println(total)
}
