package whenExpression

fun main() {
    var myListOfProducts = mutableListOf<String>("Milk", "Yogurt", "Corn", "Mango", "Potato", "rice", "Shrimp")
   var myListOfPrices = mutableListOf<Double>(2.80, 1.75,3.50, 1.67, 0.33, 5.00, 12.67)
    println("The size of my list of products is ${myListOfProducts.size}")
    println("This is my product in the position 0: ${myListOfProducts[0]}")
    myListOfProducts.add("Mayo")
    myListOfPrices.add((4.80))
    for (product in myListOfProducts){
        print("$product ")
        print("\n")
    }
    println("The size of my list of products is ${myListOfProducts.size}")
    println("The size of my list of prices is ${myListOfPrices.size}")

    //agregar productos en un menu

    println("please add a product")
    var newProduct = readLine()
    if (newProduct != null) {
        myListOfProducts.add(newProduct)
    }

    for (product in myListOfProducts){
        print("$product ")
    }
    print("\n")
    println("The size of my list of products is ${myListOfProducts.size}")

    //puedoo incluir un do while  mientras la persona quiera agregar elementos a la lista si no .... quiiere agregar ootroo elemento? si-> add no-> exit
}
