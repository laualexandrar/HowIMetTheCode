package aboutfiles

fun main() {
    val num1 = 172
    if(num1 == 172) {
        println("num is 172")
    }
    if (num1 == 173){
        println("num is 173")
    } else {
        println("We don't know")
    }

    val isNum1 = if (num1 == 172) {
        true
    } else {
        false
    }
    println (isNum1)

    val isNum2 = if (num1 == 172){
        val word = "Chonchito"
        print(word)
        true
    } else {
        false
    }



    val familia = "Chonchitos"
    val isGreatherThan30 = if (familia == "Chocnhitos"){
        var camilo = 32
        var laura = 27
        var greatherThan30 = false
        greatherThan30 = if (laura >= 30 || camilo >= 30){
            true
        } else {
            false
        }
        greatherThan30
    }else{
        false
    }
}