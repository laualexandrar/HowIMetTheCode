package sealedclasses

fun main() {
    transaction(options.purchase)
    transaction(options.sale)
}

sealed class options{
    object purchase : options()
    object sale : options()

}

fun transaction(type:options){
    when(type) {
        options.purchase -> println("this is a purchase")
        options.sale -> println("This is a sale")
    }
}