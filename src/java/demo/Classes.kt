package demo

open class Base {
    open fun v() {
        "Something"
    }
    fun nv() {}
}
class Derived() : Base() {
    override fun v() {
        println("Something else")
    }
}

open class Foo(){
    open fun f(){}
    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() { /* ... */ }
    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar.f() // Calls Foo's implementation of f()
            println(super@Bar.x) // Uses Foo's implementation of x's getter
        }
    }
}

open class Person (firstName: String){
    constructor(firstName: String, lastName: String) : this(firstName){
        println("Initialized with a lastName of $lastName")
    }
}

class Man : Person{
    constructor(age: Int) : super("John")

    companion object {
        fun getCount() = 1
    }
}

class InitOrderDemo(name: String) {

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main(args: Array<String>) {

    val orderDemo = InitOrderDemo("Name")

    val person = Person("John", "Smith")

    orderDemo.firstProperty
    orderDemo.secondProperty

    val derivedClass = Derived()



    println(Man.Companion)
    println(Man.Companion.getCount())
    println(Man.getCount())

    derivedClass.v()
}