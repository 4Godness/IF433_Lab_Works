package oop_126847_ZahraAriestya.week04

// ElectricCar adalah Child dari Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    // final override agar tidak bisa di-override lagi oleh turunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}