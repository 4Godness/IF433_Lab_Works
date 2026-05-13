package oop_126847_ZahraAriestya.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(
    val requested: Int,
    val available: Int
) : FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException : FeederException("Wadah dispenser tersangkut/macet!")