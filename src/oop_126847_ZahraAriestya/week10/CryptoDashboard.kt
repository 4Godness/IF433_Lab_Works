package oop_126847_ZahraAireysta.week10

// Data models
data class Coin(val name: String, val balance: Double)
data class Transaction(val id: String, val amount: Double)

// Generic Repository
class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items
}

// API Response Wrapper
data class ApiResponse<T>(val status: String, val data: T)

// Main Dashboard
fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    // Checkpoint 15: Inisialisasi coin repository
    val coinRepo = WalletRepository<Coin>()

    // Checkpoint 16: Mengisi Data Dompet (minimal 3 koin)
    coinRepo.add(Coin("Bitcoin (BTC)", 0.85))
    coinRepo.add(Coin("Ethereum (ETH)", 4.20))
    coinRepo.add(Coin("Tether (USDT)", 1250.50))
    coinRepo.add(Coin("Solana (SOL)", 15.30))

    // Checkpoint 17: Simulasi Response Jaringan
    // Bungkus semua koin dalam ApiResponse
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Tampilkan status response
    println("\n=== API RESPONSE ===")
    println("Status: ${response.status}")
    println("Total data: ${response.data.size} items")

    // Tampilkan data koin dari response
    println("\nCoin List from API Response:")
    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }
}