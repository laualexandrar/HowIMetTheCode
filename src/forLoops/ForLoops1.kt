package forLoops

fun main() {
   val fruits = listOf<String>("Papaya", "Mango", "Apple", "Cherry")
    val numbers = listOf<Int>(3,4,5,6)
    val doubleNumbers = listOf<Double>(3.3, 3.4,3.5)


    for (fruit in fruits){
        print("$fruit ")
    }
    println("\n")
    for (fruit in fruits){
        print("I love $fruit, ")
    }
    println("\n")
    for(number in numbers){
        print("$number ")
    }
    println("\n")
    for (numb in 1..10){
        print("$numb ")
    }
    println("\n")
    for (numb in 10 downTo 1){
        print(" $numb ")
    }
    println("\n")
    for (num in 13 downTo  1 step 3){
        print(" $num ")
    }
    println("\n")
    for(number in 1 until 10 step 2){
        print("$number ")
    }
    println("\n")
    for (index in fruits.indices){
        print("${fruits[index]} ")
    }
    println("\n")
    for ((index, fruit) in fruits.withIndex()){
        print("$index- $fruit ") //I am printing bot
    }

    println("\n")

    for(doubleNum in doubleNumbers){
        print(" $doubleNum")
    }
    println("\n")

    for(i in 9 downTo 1){
    print("$i ")
    }

    println("\n")

    for(i in 0 downTo 6){
        print(i)
    }
    for (i in 6 downTo -3 step 4){
        print("$i ")
    }
    println("\n")

    myNumbFor(4, 4)

    myDogsFor()

    for(thing in 5 downTo 0){
        println(thing)
    }

    val myArray1 = arrayOf("Computer", "Desks", "Mouse", "Laptop")
    myArray1[0] = "Milk"
    for (word in myArray1){
        println(word)
    }
}

fun myNumbFor(num1:Int, num2:Int){
    if(num1 == num2){
        for (number in 1..5){
            println(number)
        }
    }
}

fun myDogsFor(){
    var myDogs = listOf<String>("Pepa", "Rex","Firulais","Simba")
    for(dog in myDogs){
        println(dog)
    }
}
