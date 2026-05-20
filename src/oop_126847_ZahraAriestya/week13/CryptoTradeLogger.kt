package oop_126847_ZahraAriestya.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
    println("Trades berhasil disimpan ke $path")
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    // Membuat mock data riwayat trade simulasi
    val trades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 1000.0, pnl = 250.0),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 500.0, pnl = 175.0),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 300.0, pnl = 89.5)
    )

    // Menyimpan ke file crypto_trades.csv
    saveTrades(trades, path = "crypto_trades.csv")

    // INJECT DATA KORUP - untuk testing robustness
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    println("Data korup telah diinject untuk testing")

    // Tarik histori transaksi dengan loadTrades
    val loadedData = loadTrades("crypto_trades.csv")

    // Hitung jumlah PnL bersih menggunakan sumOf
    val totalPnL = loadedData.sumOf { it.pnl }
}