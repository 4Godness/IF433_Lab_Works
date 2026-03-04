package oop_126847_ZahraAriestya.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    // Override fungsi processPayment dari abstract class PaymentMethod
    override fun processPayment(amount: Double) {
        println("Memproses pembayaran via E-Wallet atas nama $accountName...")
        println("Saldo saat ini: Rp${String.format("%.0f", balance)}")
        println("Jumlah pembayaran: Rp${String.format("%.0f", amount)}")

        if (balance >= amount) {
            balance -= amount
            println("✅ Pembayaran berhasil!")
            println("Sisa saldo: Rp${String.format("%.0f", balance)}")
        } else {
            println("❌ Saldo tidak cukup!")
            println("Dibutuhkan tambahan: Rp${String.format("%.0f", amount - balance)}")
        }
    }

    // Fungsi spesifik yang hanya dimiliki EWallet
    fun topUp(amount: Double) {
        println("\n--- Melakukan Top Up E-Wallet ---")
        println("Saldo sebelum top up: Rp${String.format("%.0f", balance)}")
        balance += amount
        println("Top up sebesar Rp${String.format("%.0f", amount)} berhasil!")
        println("Saldo setelah top up: Rp${String.format("%.0f", balance)}")
        println("----------------------------------")
    }
}