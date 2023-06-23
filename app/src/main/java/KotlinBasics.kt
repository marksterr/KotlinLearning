package com.example.kotlinlearning

fun main() {
    // Codelab 2: Enhanced Nullability
    fun printLengthEnhanced(str: String?) {
        when {
            str == null -> println("Unknown")
            str.isEmpty() -> println("Empty string")
            else -> println("The length is ${str.length}")
        }
    }

    printLengthEnhanced("Hello") // output: The length is 5
    printLengthEnhanced(null) // output: Unknown
    printLengthEnhanced("") // output: Empty string

    // Codelab 3: Advanced Lists
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4)
    numbers.removeAt(0)
    println(numbers) // output: [2, 3, 4]

    // Codelab 4: Advanced Control Flow - When
    fun describeType(obj: Any) {
        when (obj) {
            is Int -> println("Integer")
            is String -> println("String")
            else -> println("Unknown type")
        }
    }

    describeType(0) // output: Integer
    describeType("Hello") // output: String

    // Codelab 5: Advanced Functions and Interoperability
    fun printCalculation(a: Int, b: Int, operation: (Int, Int) -> Int) {
        val result = operation(a, b)
        println("The result is $result")
    }

    printCalculation(5, 3, {a, b -> a * b}) // output: The result is 15

    // Codelab 6: Advanced Classes and Inheritance
    open class Shape {
        open fun draw() {
            println("Drawing a shape...")
        }
    }

    class Circle : Shape() {
        override fun draw() {
            println("Drawing a circle...")
        }
    }

    class Square : Shape() {
        override fun draw() {
            println("Drawing a square...")
        }
    }

    val shape: Shape = Circle()
    shape.draw() // output: Drawing a circle...

    val anotherShape: Shape = Square()
    anotherShape.draw() // output: Drawing a square...
}