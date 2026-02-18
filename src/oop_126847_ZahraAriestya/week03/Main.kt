package oop_126847_ZahraAriestya.week03

fun main() {
    println("=== Guided Lab: Employee Class ===")
    val employee = Employee("Budi")
    employee.salary = 5000
    println("Nama: ${employee.name}, Gaji: ${employee.salary}")

    println("\n--- Test Validasi Gaji ---")
    employee.salary = -100
    println("Gaji setelah set -100: ${employee.salary}")

    println("\n--- Test Performance Rating ---")
    employee.increasePerformance()
    employee.increasePerformance()
    employee.printStatus()
    println("Tax: ${employee.tax}")

    println("\n=== Tugas 1: Testing Weapon Class ===")
    val pedang = Weapon("Excalibur")
    println("Senjata: ${pedang.name}")
    println("Damage awal: ${pedang.damage}")
    println("Tier awal: ${pedang.tier}")

    println("\n--- Test 1: Mengeset damage negatif (-50) ---")
    pedang.damage = -50
    println("Damage setelah set -50: ${pedang.damage}")
    println("Tier setelah set -50: ${pedang.tier}")

    println("\n--- Test 2: Mengeset damage terlalu besar (9999) ---")
    pedang.damage = 9999
    println("Damage setelah set 9999: ${pedang.damage}")
    println("Tier setelah set 9999: ${pedang.tier}")

    println("\n--- Test 3: Mengeset damage normal (750) ---")
    pedang.damage = 750
    println("Damage setelah set 750: ${pedang.damage}")
    println("Tier setelah set 750: ${pedang.tier}")

    println("\n=== Tugas 2: Testing Player Class (Sesuai Instruksi Modul) ===")
    val player = Player("Zahra")
    println("Username: ${player.username}")
    println("Level awal: ${player.level}")  // Harusnya level 1

    // Mencoba akses xp langsung - ini akan ERROR (sesuai instruksi)
    // println("XP: ${player.xp}")  // ERROR: Cannot access 'xp': it is private

    println("\n--- Test: addXp(50) ---")
    player.addXp(50)  // Masih level 1
    println("Level setelah 50 XP: ${player.level}")

    println("\n--- Test: addXp(60) (total 110) ---")
    player.addXp(60)  // Harus Level Up ke 2
    println("Level setelah total 110 XP: ${player.level}")

    println("\n=== Selesai Testing Player ===")
}