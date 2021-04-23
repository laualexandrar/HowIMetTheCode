package firstStepsMyProject

import kotlin.random.Random

fun main() {
    var myListOfProducts = mutableListOf<String>("Yogurt", "Ice Cream", "Chicken", "Potato", "Tomato", "Pineapple", "Chips")
    var myListOfPrices = mutableListOf(3.50, 5.60, 6.00, 0.50, 0.68, 4.50, 2.50)
    var quantity = mutableListOf(4,5,6,3,6,3,3)

    //look price by product
    var i = myListOfProducts.size
    var whichProduct = Random.nextInt(0, i)
    print("these are the options")
    when (whichProduct){
        0 -> print(myListOfPrices[0])
        1 -> print(myListOfPrices[1])
        2 -> print(myListOfPrices[2])
        3 -> print(myListOfPrices[3])
        4 -> print(myListOfPrices[4])
        5 -> print(myListOfPrices[5])
        6 -> print(myListOfPrices[6])
        //7 -> print(myListOfPrices[7])
        else -> print(myListOfPrices[whichProduct])
    }

    print("\n")

    //Size
    println("MyListOfProducts Size is: = ${myListOfProducts.size}")
    println("MyLIstOfPrices Size is = ${myListOfPrices.size}")
    println("My quantity Size is = ${quantity.size}")
    print("\n")
    myListOfPrices.add(4.60)
    myListOfProducts.add("Cake")
    quantity.add(4)

    //Size
    println("MyListOfProducts Size v2 is: = ${myListOfProducts.size}")
    println("MyLIstOfPrices Size v2 is = ${myListOfPrices.size}")
    println("My quantity Size v2 is = ${quantity.size}")
    print("\n")
    myListOfPrices.removeAt(0)
    myListOfProducts.removeAt(0)
    quantity.removeAt((0))

    println("MyListOfProducts Size v3 is: = ${myListOfProducts.size}")
    println("MyLIstOfPrices Size v3 is = ${myListOfPrices.size}")
    println("My quantity Size v3 is = ${quantity.size}")
    print("\n")

    print("$myListOfProducts ")

    print("\n")

    print("$myListOfPrices ")

    print("\n")
    print("please add a new product: ")
    var newProduct = readLine()
    if (newProduct != null) {
        myListOfProducts.add(newProduct)
    }

    print("$myListOfProducts ")

    print("\n")
    for (product in myListOfProducts){
        print("$product ")
    }
    print("\n")
    print(myListOfProducts[0])

    print("\n")

    for (product in 0 until myListOfProducts.size){
        print(myListOfProducts[product])
    }



}
