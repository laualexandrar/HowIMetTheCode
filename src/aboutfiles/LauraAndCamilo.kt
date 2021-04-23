package aboutfiles

fun main() {

    println(phrase("Laura"))
    println(myGrades(3.5, 4.8, 5.0))
    println(myGradesWithoutReturn(3, 5, 4))
    myGradesWithoutReturn(3, 5, 4)
    println(sumGradesReturn())
}

fun phrase(name: String): String {

    val myPhrase = "Camilo + $name"

    return myPhrase
}


// three grades

fun myGrades(grade1: Double, grade2: Double, grade3: Double): Double {

    var myGradesSum = grade1 + grade2 + grade3

    return myGradesSum
}

fun myGradesWithoutReturn(myGrade1: Int, myGrade2: Int, myGrade3: Int) {
    val sumWithoutReturn = myGrade1 + myGrade2 + myGrade3
    println(sumWithoutReturn)
}

fun sumGradesReturn(): Double {
    var sum1 = myGrades(3.3, 2.3, 2.0)
    var sum2 = myGrades(4.0, 4.4, 3.4)
    var sum3 = myGrades(4.0, 4.4, 3.4)
    return myGrades(sum1, sum2, sum3)
}