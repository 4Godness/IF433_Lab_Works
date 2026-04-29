package oop_126847_ZahraAriestya.week10

class pairBox<K, V>(val key: K, val value: V)

fun main() {
    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = pairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")
}