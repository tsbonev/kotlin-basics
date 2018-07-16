package demo


fun sum(a: Int, b: Int): Int{

    return a + b

}

fun printSum(a: Int, b: Int) {

    println("sum of $a and $b is ${a + b}")

}

fun isCastsToTheType(string: Any){

    if(string is String){
        println(string)
    }

}

fun decribe(obj: Any): String =
        when(obj){
            1 -> "One"
            "Hello" -> "Greeting"
            is Long ->  "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun sumShorter(a: Int, b: Int) = a + b

fun ifAsAnExpression(a: Int, b: Int) = if (a > b) b else a

fun parseInt(str: String): Int?{
    return null
}

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

    isCastsToTheType(1)
    isCastsToTheType("234")

    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items){
        println(item)
    }

    for (index in items.indices){
        println("$index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(decribe(2))

    val x = 10
    val y = 9
    if (x in 1..y+1){
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    for (x in 1..5){
        println(x)
    }

    println("---")

    for (x in 1..10 step 2){
        println(x)
    }

    println("---")

    for (x in 9 downTo 0 step 3){
        println(x)
    }


}