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
    println("=".repeat(50))
    println("🚀 CRYPTO WALLET DASHBOARD")
    println("=".repeat(50))

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin (BTC)", 0.85))
    coinRepo.add(Coin("Ethereum (ETH)", 4.20))
    coinRepo.add(Coin("Tether (USDT)", 1250.50))
    coinRepo.add(Coin("Solana (SOL)", 15.30))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("\n📊 COIN PORTFOLIO")
    println("-".repeat(40))
    println("Status: ${response.status}")
    println("-".repeat(40))

    response.data.forEach { coin ->
        println("💰 ${coin.name}: ${coin.balance}")
    }
    println("-".repeat(40))
    println("Total coins: ${response.data.size}")

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 0.12))
    txRepo.add(Transaction("TX003", 25.75))
    txRepo.add(Transaction("TX004", 0.03))

    println("\n📝 TRANSACTION HISTORY")
    println("-".repeat(40))
    txRepo.getAll().forEach { tx ->
        println("📎 ${tx.id}: ${tx.amount} BTC")
    }
    println("-".repeat(40))
    println("Total transactions: ${txRepo.getAll().size}")

    println("\n" + "=".repeat(50))
    println("✅ SYSTEM STATUS: All systems operational")
    println("📦 Generic types verified: Coin & Transaction")
    println("🔒 Type safety: No casting errors detected")
    println("=".repeat(50))
}