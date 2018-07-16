package demo


fun sum(a: Int, b: Int): Int{

    return a + b

}

fun printSum(a: Int, b: Int) {

    println("sum of $a and $b is ${a + b}")

}

fun sumShorter(a: Int, b: Int) = a + b

fun main(args : Array<String>){
    println("Hello, world!")
    println(sumShorter(1, 2))
    printSum(1, 2)

    val a: Int = 1
    val b = 2
    printSum(a, b)
    val c: Int
    c = 2

    var d = 3
    d += 3

    val s1 = "The number three is $d"
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s1)
    println(s2)

    


}