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

fun useFunction(parameter: String, func: (String) -> Unit) = func(parameter)


val value: KClass<Int> = Int::class

val valIsFun: (String) -> Unit = ::printStuff

val valIsLambdaFun = { s: String ->
    println(s)
    println("-----")
}

fun main(args: Array<String>) {

    useFunction("Print me", ::printStuff)
    useFunction("Print me too", ::printStuffWithSpaces)

    useFunction("Print me with a value", valIsFun)

    useFunction("Print me with an underscore", valIsLambdaFun)

    println(value)

}