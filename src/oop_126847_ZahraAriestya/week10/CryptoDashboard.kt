package oop_126847_ZahraAireysta.week10

data class Coin(val name: String, val balance: Double)
data class Transaction(val id: String, val amount: Double)

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items
}

data class ApiResponse<T>(val status: String, val data: T)

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin (BTC)", 0.85))
    coinRepo.add(Coin("Ethereum (ETH)", 4.20))
    coinRepo.add(Coin("Tether (USDT)", 1250.50))
    coinRepo.add(Coin("Solana (SOL)", 15.30))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("\n=== DASHBOARD CRYPTO WALLET ===")
    println("Response Status: ${response.status}")
    println("=".repeat(40))

    println("Daftar Aset Koin:")
    response.data.forEach { coin ->
        println("  💰 ${coin.name}: ${coin.balance}")
    }

    println("=".repeat(40))
    println("Total aset: ${response.data.size} jenis koin")
}