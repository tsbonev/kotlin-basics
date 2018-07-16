package demo


fun defaultVal(x: Any = "123") {
    println(x)
}

fun main(args: Array<String>) {

    defaultVal()
    defaultVal(2)

    val map: MutableMap<Int, Int> = mutableMapOf(1 to 1, 2 to 3)
    val newMap = map.plus(3 to 5)
    map.put(5, 6)
    map[3] = 5

    for ((k, v) in newMap){
        println("$k -> $v")
    }

    println(map[3])
    println(map[7])

    val p: String by lazy { "123456" }

    println(p)

    fun String.spaceToCamelCase() : String {
        return "No"
    }

    println("Convert this to camel case".spaceToCamelCase())
    val string1 = "String"
    println(string1.spaceToCamelCase())

}