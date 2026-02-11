package oop_126847_ZahraAriestya.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

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
}
