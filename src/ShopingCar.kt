fun main (parameter: Array <String>){
    print("Enter the product price :")
    val price = readln().toInt()
    print ("Enter the quantity of the products:")
    val quantity = readln().toInt()
    val total = price  * quantity
    print ("The total of the product is :$total")

}