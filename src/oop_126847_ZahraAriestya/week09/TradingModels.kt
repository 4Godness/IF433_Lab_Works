package oop_126847_ZahraAriestya.week09

data class TradeLog(
    val pair: String,
    val position: String,   // "LONG" atau "SHORT"
    val leverage: Int,
    val roe: Double,        // Return on Equity (%)
    val status: String      // "OPEN" atau "CLOSED"
)