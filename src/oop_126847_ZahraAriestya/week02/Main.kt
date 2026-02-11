package oop_126847_ZahraAriestya.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    // ==============================
    // ====== SISTEM PMB UMN ========
    // ==============================

    println("=== APLIKASI PMB UMN ===")
    println("1. Daftar dengan Jurusan")
    println("2. Daftar tanpa memilih Jurusan")
    print("Pilihan: ")

    val choice = scanner.nextInt()
    scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 Karakter): ")
    val nim = scanner.nextLine()

    if (choice == 1) {

        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran selesai (Dengan Jurusan).")

    } else if (choice == 2) {

        val s2 = Student(name, nim)
        println("Status: Pendaftaran selesai (Tanpa Jurusan).")

    } else {
        println("Pilihan tidak valid.")
    }

    // ==============================
    // === SISTEM DENDA PERPUSTAKAAN
    // ==============================

    println("\n=================================")
    println("=== SISTEM DENDA PERPUSTAKAAN ===")
    println("=================================")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak boleh minus! Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    // ==============================
    // ===== MINI RPG BATTLE ========
    // ==============================

    println("\n===============================")
    println("=== MINI RPG BATTLE GAME ===")
    println("===============================")

    scanner.nextLine() // bersihkan buffer sebelum input String lagi

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)

    var enemyHp = 100

    println("\nPertarungan Dimulai!")
    println("$heroName VS Monster")
    println("HP Monster: $enemyHp")
    println("HP $heroName: ${hero.hp}")

    while (hero.isAlive() && enemyHp > 0) {

        println("\nPilih Aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val action = scanner.nextInt()

        if (action == 1) {

            hero.attack("Monster")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("Sisa HP Monster: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Monster menyerang balik!")
                hero.takeDamage(enemyDamage)
            }

        } else if (action == 2) {
            println("$heroName kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("$heroName MENANG! 🎉")
    } else if (!hero.isAlive()) {
        println("$heroName KALAH... 💀")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }

    scanner.close()
}
