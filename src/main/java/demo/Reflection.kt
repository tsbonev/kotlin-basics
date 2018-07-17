package demo

import kotlin.reflect.KClass

fun printStuff(printMe: String) {
    println(printMe)
}

fun printStuffWithSpaces(printMe: String){
    for (char in printMe){
        print(char)
        print(" ")
    }
    println()
}

fun useFunction(parameter: String, func: (String) -> Unit){
    func(parameter)
}

val value: KClass<Int> = Int::class

fun main(args: Array<String>) {

    useFunction("Print me", ::printStuff)
    useFunction("Print me too", ::printStuffWithSpaces)

    println(value)

}