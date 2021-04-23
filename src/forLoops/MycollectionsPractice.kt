package forLoops

fun main() {
    myNumberArray()
    print("\n")
    myNumberList()
    myNumberMutableList()
    myNumberSet()
    myNumberMutableSet()
}

fun myNumberArray() {
    var learningArrays = arrayOf("Lion", "Panther", "Cat", "Cougar")
    for (feline in learningArrays) {
        print("$feline ")
    }
    print("\n")
    learningArrays[0] = "Lynx"
    println(learningArrays.get(1))
    if (learningArrays.size == 4) {
        println(learningArrays.size)
    }
    for (newFeline in learningArrays) {
        print("$newFeline ")
    }

}

fun myNumberList() {
    var myListOfAnimals = listOf<String>("Dog", "Cat", "Rabbit", "Hamster")
    println(myListOfAnimals[2])
    for (farmAnimal in myListOfAnimals) {
        print("$farmAnimal ")
    }
    print("\n")

    if (!myListOfAnimals.isEmpty()) {
        println(myListOfAnimals[0])
    }
    print("\n")
    println(myListOfAnimals.indexOf("Hamster"))
}

fun myNumberMutableList() {
    var myMutableListOfAnimals = mutableListOf<String>("Chicken", "Turkey", "Pig", "Bull", "Cow")
    //myMutableListOfAnimals[1] = "Horse"  I Can't do this
    var myNumberInList = mutableListOf(2, 44, 66, 8, 8, 89)

    print(myMutableListOfAnimals[0])
    print("\n")
    println(myMutableListOfAnimals.add("Duck"))
    print("\n")
    myMutableListOfAnimals.removeAt(3)
    print("\n")
    for (animal in myMutableListOfAnimals) {
        println(animal)
    }


}

fun myNumberSet() {
    var mySetNums = setOf(3, 4, 5, 6, 7, 8, 3, 3)
    for (number in mySetNums) {
        print("$number ")
    }
}

fun myNumberMutableSet() {
    var mySetMutable = mutableSetOf(33, 4, 55, 3, 2, 55, 22, 33, 55)
    var mysent = setOf(22, 33, 44, 55, 66, 88)
    print("\n")
    println(mySetMutable.size)
    print("\n")
    for (number in mySetMutable) {
        print(" $number ")
    }
    print("\n")
    mySetMutable.addAll(mysent)
    for (number in mySetMutable) {
        print("$number ")
    }
    mySetMutable.remove(55)
    print("\n")
    for (number in mySetMutable) {
        print("$number ")
    }
    mySetMutable.clear()
    if(mySetMutable.isEmpty()){
        println("Is empty")
    }

}
