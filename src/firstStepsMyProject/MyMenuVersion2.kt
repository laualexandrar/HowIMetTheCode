package firstStepsMyProject

fun main() {
    val myListOneOfProducts = mutableListOf("chicken", "rice", "juice", "mango")
    val myListOfPrices = mutableListOf(3.30, 4.00, 5.20, 2.40)

    loop@ do {

        val options: String? = """
        Hi! Welcome to MyStore what would you like to do today?
        
        1. Add a product and price
        2. remove a product and price
        3. look a product price by it's name
        4. look a product name by it's price
        5. Exit
        
    """.trimIndent()
        print("\n")
        print(options)
        print("\n")
        print("Select one of our options: ")
        val myInput = readLine()!!.toInt()

        print("\n")
        when (myInput) {
            1 -> {
                //1. Add a product and price
                print("You selected one, Please add a new product: ")
                print("\n")
                val newProduct = readLine()
                if (newProduct != null) {
                    myListOneOfProducts.add(newProduct)
                    if (newProduct.isEmpty()){
                        print("You need to ingress a value. Try again")
                        break@loop
                    }
                }

                print("\n")
                print("Please add a new price for that product")
                print("\n")
                val newPrice = readLine()?.toDouble()
                if (newPrice != null) {
                    myListOfPrices.add(newPrice)
                }

                print("\n")
                print("These are the products and prices up to date: ")
                print("\n")
            for (number in 1 until myListOneOfProducts.size){
                println("${myListOneOfProducts[number]}: ${myListOfPrices[number]} ")
            }

                print("\n")
                print("The size of myListOneOfProducts is ${myListOneOfProducts.size}")
                print("\n")
                print("The size of myListOfPrices is ${myListOfPrices.size}")
                print("\n")
                print("\nWould you like to do another modification to the list of find another product?")
                print("\n")
            }

            2 -> {
                //2. remove a product and price
                print("Which product would you like to remove today?")
                print("\n")
                print("These are the products that we have available now: ")
                print("\n")
                var x = 1
                for (product in myListOneOfProducts){
                    println("$x. $product")
                    x++
                }
                print("\n")
                print("Write the name of the product that you like to remove: ")

                val removeProduct = readLine()?.toLowerCase()

                if(myListOneOfProducts.contains(removeProduct)) {
                    var index = myListOneOfProducts.indexOf(removeProduct)
                    print("This is $index")
                    myListOfPrices.removeAt(index)

                    myListOneOfProducts.remove(removeProduct)
                } else {
                    print("You had a typo or you are writing a product that is not on the list. Try again")
                    break@loop
                }

                print("\n")
                print("This is the updated list of products")
                print("\n")

                var y = 1
                for (product in myListOneOfProducts){
                    println("$y. $product")
                    y++
                }

                print("\n")
                print("This is the updated list of prices")
                print("\n")

                var r = 1
                for(price in myListOfPrices){
                    println("$r. $price")
                }

                print("\n")
                print("Thanks for joining us! ")
                print("\n")

            }
            3 -> {
                // 3. look a product price by it's name
                print("Please write the name of the product that you are looking for and we will let you know the price of it:")

                print("\n")
                print("These are the products that we currently have: ")
                print("\n")
                var p = 1
                for (product in myListOneOfProducts){
                    println("$p. $product")
                    p++
                }

                var productName = readLine()?.toLowerCase()
                if(myListOneOfProducts.contains(productName)){
                    var indexProduct = myListOneOfProducts.indexOf(productName)
                    print("The price of $productName is ${myListOfPrices[indexProduct]}")
                    print("\n")
                }else {
                    print("You are writing a product that doesn't exist in our records. Try again")
                    print("\n")
                    break@loop
                }


            }
            4 -> {
                //4. look a product name by it's price
                print("\n")
                print("If you are looking for a product, these are our prices. Write the price and find the product for that price: ")
                print("\n")
                var l = 1
                for (price in myListOfPrices){
                    println("$l. $price")
                    l++
                }


                var myPriceForAProduct = readLine()?.toLowerCase()?.toDouble()
                if(myListOfPrices.contains(myPriceForAProduct)){
                    var indexPrice = myListOfPrices.indexOf(myPriceForAProduct)
                    print("You wrote the price $myPriceForAProduct. This is equal to ${myListOneOfProducts[indexPrice]}")
                    print("\n")
                }else {
                    print("None of our products have that price. Try again")
                    print("\n")
                    break@loop
                }

            }
            5 -> {
                print("\n")
                print("Thanks for coming to MyStore! Hope you have a great day!")
                print("\n")
                break@loop
            }
        }
    } while (myInput in 1 until 5)
}
