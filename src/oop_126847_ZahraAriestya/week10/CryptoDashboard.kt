package oop_126847_ZahraAireysta.week10

// Data models
data class Coin(val name: String, val balance: Double)

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    // Buat list sederhana
    val coins = mutableListOf<Coin>()
    println("Repository created successfully!")
    println("Total coins: ${coins.size}")
}