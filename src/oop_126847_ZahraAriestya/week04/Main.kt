package oop_126847_ZahraAriestya.week04

fun main() {
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Employee Hierarchy (Tugas 2) ---")

    // Buat objek Manager
    val manager = Manager("Budi", 8000000)
    println("Manager: ${manager.name}")
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println()

    // Buat objek Developer
    val developer = Developer("Ani", 6000000, "Kotlin")
    println("Developer: ${developer.name}")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}