package oop_126847_ZahraAriestya.week07

class NetworkClient private constructor(val url: String) {

    fun connect() {
        println("Connecting to $url...")
    }

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
}