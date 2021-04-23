package forLoops

fun main() {

    for (number in 0..100 step 10) {
        if (number < 100) {
            print("$number, ")
        } else {
            print(number)
        }
    }

    println("\n")

    for (number in 60 downTo 10 step 5) {
        if (number > 10) {
            print("$number, ")
        } else {
            print("$number")
        }
    }
    println("\n")
    pairNumbs()
    println("\n")
    pairDownNumbs()
    println("\n")
    fruits()
    println("\n")
    myArraysPractice()
    println("\n")
    myListPractice()
    println("\n")
    myBookListExample()
    println("\n")
    myEnglishBooks()
    println("\n")
    myFun()
}

fun pairNumbs() {
    for (num in 0..100 step 2) {
        if (num < 100) {
            print("$num, ")
        } else {
            print(num)
        }
    }
}

fun pairDownNumbs(){
    for (num in 100 downTo 0 step 2 ){
        if(num > 0){
            print("$num, ")
        } else {
            print(num)
        }
    }
}

fun fruits(){
    val myFruits = listOf("Banana", "Mango", "Pear", "Peach")
     for (fruit in myFruits.indices){
         println(myFruits[fruit])
     }

    for ((index, fruit) in myFruits.withIndex()){
        println("$index , $fruit")
    }
}

fun myArraysPractice(){
    val myArray = arrayOf("Milk","Eggs","Potato") // I can't change array size
    myArray[0] = "Chips" // Arrays are mutable
    myArray[1] = "Hot Dogs"
    myArray[2] = "Pizza"

    for (element in myArray){
        print("$element ")
    }

}

fun myListPractice(){
    val myList = listOf<String>("Computer", "Mouse", "Printer", "Computer") // I can have duplicated values in List
    // myList[0] = "Laptop"  I can't do this!! For this I need a mutableList
    if(myList.isNotEmpty()){ // This means if(myList.size > 0)
        print(myList.get(1)) // I use get to access the item that the index contain
        for (item in myList){
            println("$item, ")
        }
   }
    if (myList.contains("Printer")){
        println("This is my favorite ${myList[2]}")
        print("This is the index of printer: ${myList.indexOf("Printer")}")
    }
}

fun myBookListExample(){
    val shopping: List<String> = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
        print(shopping.get(0))
//Prints "Tea"
    }
}

fun myEnglishBooks(){
    val myBeautyArray = arrayOf("Book1","Book2","Book3")
    myBeautyArray[0]= "Grammar 1 "
    myBeautyArray[1]= "Grammar 2 "

    for (book in myBeautyArray){
        print("$book.")
    }
    println("\n")
    val myBeautifulList = listOf("Writing 1", "Writing 2", "Writing 2") //List are immutable, I can't add thing to a list
    // I can have duplicated values in a list
    println(myBeautifulList[0])
    for (element in myBeautifulList){
        println(element)
    }
    println("\n")
    val myMutableBeautyList = mutableListOf("Reading1 ", "Reading2 ", "Reading3 ","Reading5")
    myMutableBeautyList.add("Reading4 ")
    myMutableBeautyList.add(0,"Reading0 ")
    myMutableBeautyList.remove("Reading5")
    myMutableBeautyList.removeAt(3) // remove "Reading3 because the list now is Reading0 Reading1 Reading2 Reading4


    for(item in myMutableBeautyList){
        print(item)
    }

    val mynumbersList = mutableListOf(2,1,4,2,3)
    val myOtherNumbers = mutableListOf(9,8,99,6)
    val myRemoves = listOf(33,44,55)
    val toretain = listOf(99,8)
    mynumbersList.sort()
    mynumbersList.reverse()
    mynumbersList.shuffle()
    mynumbersList.addAll(myOtherNumbers)
    mynumbersList.addAll(myRemoves)
    for (number in mynumbersList){
        print("$number ")
    }
    println("\n")
    mynumbersList.removeAll(myRemoves)
    mynumbersList.retainAll(toretain)
    for (numer2 in mynumbersList){
        print( "$numer2 ")
    }
    println("\n")
    mynumbersList.clear()
    if(mynumbersList.isEmpty()) {
        println("The list is empty")
        print(mynumbersList)
    }
    println("\n")
    val myNumberList2 = myOtherNumbers.toList()
    for(number in myNumberList2){
        print("$number ")
    }
    println("\n")
    val myNumberList3 = myOtherNumbers.toMutableList()
    myNumberList3.sort()
    print(myNumberList3)
}

fun myFun() {
    var a = mutableListOf<String>()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)
    if (a.contains("Zero")) {
        a.add("Eight")
    }
    a.removeAt(0)
    println(a)
    if(a.indexOf("Four")!= 4)
        a.add("Ten")
    println(a)
    if(a.contains("Zero"))
        a.add("Twelve")
    println(a)
}


