package demo

fun Int.apply(func: (Int) -> Int): Int {
    return func(this)
}

fun summer(a: Int, b: Int): Int {
    return a + b
}

fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
    val newList = ArrayList<T>()
    for(item in this){
        if(predicate(item)){
            newList.add(item)
        }
    }

    return newList
}

fun Any.lock(func: () -> Unit) {
    synchronized(this){
        func()
    }
}

fun main(args: Array<String>) {
    val double = 1.apply { it * 2 }
    println(double)

    val names = listOf("Jake", "Jesse", "Matt", "Alec")
    val jNames = names.filter { it.contains('J') }
    println(jNames)

}