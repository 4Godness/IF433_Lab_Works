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
    scanner.nextLine() // bersihkan buffer

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

    // Validasi tidak boleh minus
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

    scanner.close()
}
