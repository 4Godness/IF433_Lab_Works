package oop_126847_ZahraAriestya.week13
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCSV(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(name = parts[0], age = parts[1].toInt(), gpa = parts[2].toDouble())
}

fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString(separator = "\n") { it.toCSV() })
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.5),
    )
    saveStudents(students, "students.csv")

    val loaded = loadStudents("students.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it)}
}
