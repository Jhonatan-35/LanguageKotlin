fun main (parameter :Array <String>){
    println("Enter the first value:")
    val value1 = readln() .toInt()
    println("Enter the second value:")
    val value2 = readLine() !!.toInt()
    val sum = value1 + value2
    println("The sum of the $value1 and the sum of the $value2 is $sum")
    val product = value1 * value2
    println ("The product of $value1 and $value2 is $product")
}
