package oop_001_johnthor.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 80) / 100
    } else {
        (price * 90) / 100
    }
