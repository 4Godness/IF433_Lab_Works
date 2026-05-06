package oop_126847_ZahraAriestya.week11

data class User(var nama: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        nama = "Alex"
        age = 25
    }
}