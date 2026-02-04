package oop_126847_ZahraAriestyaSennova.week01

fun main() {
    val name ="Zahra Ariestya"
    val score = 80

    println("Nama: $name, Nilai: $score")
    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null

    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
