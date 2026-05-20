package oop_126847_ZahraAriestya.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCSV(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(name = parts[0], age = parts[1].toInt(), gpa = parts[2].toDouble())
}