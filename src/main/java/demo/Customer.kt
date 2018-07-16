package demo

data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {

    val mark = Customer("Mark", "mark@gmail.com")
    val theOtherMark = Customer("Mark", "mark@gmail.com")
    val don = Customer("Don", "mark@gmail.com")

    println(mark == theOtherMark)
    println(mark == don)

    println(mark.hashCode())
    println(theOtherMark.hashCode())
    println(mark.toString())

    println(mark.component1())
    println(mark.component2())


}