package oop_126847_ZahraAriestya.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu terbuka")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}