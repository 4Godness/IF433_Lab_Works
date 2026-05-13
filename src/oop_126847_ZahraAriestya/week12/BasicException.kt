package oop_126847_ZahraAriestya.week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Devision attempt finished")
    }
}

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputStriung = "123A"

    // try langsung mengembalikan hasil parsing, atau -1
    val result: Int = try {
        Integer.parseInt(inputStriung)
    } catch (e: NumberFormatException) {
        -1
    }
}