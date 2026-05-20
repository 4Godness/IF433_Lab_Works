package oop_126847_ZahraAriestya.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru. \n")
    println("Teks berhasil di-append.")

    println("\n=== TEXT READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}