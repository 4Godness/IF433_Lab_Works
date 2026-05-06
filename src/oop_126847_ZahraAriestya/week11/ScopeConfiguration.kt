package oop_126847_ZahraAriestya.week11

data class User(var nama: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        nama = "Alex"
        age = 25
    }

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")
}
