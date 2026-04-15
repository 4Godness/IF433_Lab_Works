package oop_126847_ZahraAriestya.week08

sealed class Product {
    abstract val id: String
    abstract val name: String
}

data class Electronic(
    override val id: String,
    override val name: String,
    val warrantyMonths: Int
) : Product()

data class Clothing(
    override val id: String,
    override val name: String,
    val size: String
) : Product()