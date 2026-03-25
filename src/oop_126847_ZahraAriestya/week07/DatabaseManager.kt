package oop_126847_ZahraAriestya.week07

object DatabaseManager {
    var connectionStatus: String = "Discoennected"

    fun connect() {
        connectionStatus = "Coennected to Server"
        println("Database is ready.")
    }
}