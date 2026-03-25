package oop_126847_ZahraAriestya.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST COPY & DESTRUCTURING ===")

    val user1 = DataUser("Alice", 22)
    // copy → buat object baru dari user1
    val user2 = user1.copy(age = 25)

    println("User1: $user1")
    println("User2 (hasil copy): $user2")

    // destructuring
    val (name, age) = user2
    println("Destructured -> Name: $name, Age: $age")
}