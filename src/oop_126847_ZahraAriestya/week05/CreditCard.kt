package oop_126847_ZahraAriestya.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    // Override fungsi processPayment dari abstract class PaymentMethod
    override fun processPayment(amount: Double) {
        println("Memproses pembayaran via Credit Card atas nama $accountName...")
        println("Limit kartu: Rp${String.format("%.0f", limit)}")
        println("Jumlah terpakai: Rp${String.format("%.0f", usedAmount)}")
        println("Sisa limit: Rp${String.format("%.0f", limit - usedAmount)}")
        println("Jumlah pembayaran: Rp${String.format("%.0f", amount)}")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("✅ Pembayaran berhasil!")
            println("Total terpakai sekarang: Rp${String.format("%.0f", usedAmount)}")
        } else {
            println("❌ Transaksi ditolak! Melebihi batas limit.")
            println("Maksimum pembayaran yang diizinkan: Rp${String.format("%.0f", limit - usedAmount)}")
        }
    }
}