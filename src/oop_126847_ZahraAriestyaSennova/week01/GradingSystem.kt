package oop_126847_ZahraAriestyaSennova.week01

fun main() {
    val name ="Zahra Ariestya"
    val score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when(score){
        in 90 < .. < 100 -> "A"
        in 80 < .. < 89 -> "B"
        in 70 < .. < 79 -> "C"
        else -> "D"
    }

    println("Grade: $grade")
}