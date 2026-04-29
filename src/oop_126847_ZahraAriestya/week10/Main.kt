package oop_126847_ZahraAriestya.week10

fun main() {
    println("\n=== TEST GENERIC CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result =processData("Stable Coin")
    println("Hasil proses: $result")

    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}