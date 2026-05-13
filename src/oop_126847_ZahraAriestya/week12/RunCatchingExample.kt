package oop_126847_ZahraAriestya.week12

fun main() {
    println("=== TEST RUNATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}