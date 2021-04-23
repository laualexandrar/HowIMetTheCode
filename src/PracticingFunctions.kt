fun main() {
    println(myCreativeFun(2, 3))
    println(myCreativeDoublesFun(3.4, 4.4))
    println(myVeryCreativeFun())
    println(practicingWitMath(2, 3, 2))
    println(oneStory("Patricia", "Journalist", 3))
    println(seconStory("Bob", "Doctor"))
}

fun myCreativeFun(num1: Int, num2: Int): Int {
    var sum = 0 // I can omit this line in this case
    sum = num1 + num2
    return sum
}

fun myCreativeDoublesFun(num1: Double, num2: Double): Double {
    var sum = num1 + num2
    return sum
}

fun myVeryCreativeFun(): Double {
    var sum1 = myCreativeFun(2, 2) + myCreativeFun(3, 4)
    var sum2 = myCreativeFun(3, 3) + myCreativeDoublesFun(3.4, 3.4)
    var sum3 = myCreativeDoublesFun(4.5, 34.4) + myCreativeDoublesFun(3.4, 4.5)
    return sum1 + sum2 + sum3
}

fun practicingWitMath(num1: Int, num2: Int, num3: Int): Int {
    var sum1 = num1 + num2 // 5
    var sum2 = num2 + num3 //num2 =3 + 2 = 5
    var sum3 = num3 + num1// 4

    return sum1 + (sum2 * sum3) + sum1
}

fun oneStory(name: String, occupation: String, years: Int ): String {
    val person1 = "$name works as a $occupation in this store for $years years"
    return person1

}

fun seconStory(name: String, occupation: String):String {
   val people = oneStory("Pepa", "Engineer" ,3) + " and $name is a $occupation"
    return people
}

