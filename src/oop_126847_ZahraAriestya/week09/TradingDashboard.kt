package oop_126847_ZahraAriestya.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 25, -12.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 50, 25.0, "OPEN"),   // masih OPEN
        TradeLog("BTCUSDT", "LONG", 30, 3.2, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -2.5, "OPEN")    // masih OPEN
    )

    println("=== Total Trade History: ${tradeHistory.size} trades ===")
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("\n=== CLOSED TRADES (${closedTrades.size} items) ===")
    closedTrades.forEach { println(it) }

    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("\n=== WINNING TRADES (${winningTrades.size} items) ===")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("\n=== LOSING TRADES (${losingTrades.size} items) ===")
    losingTrades.forEach { println(it) }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}] : +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }  // dari negatif terbesar ke terkecil
        .map { "LOSS [${it.pair} - ${it.position}] : ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach { println(it) }
}