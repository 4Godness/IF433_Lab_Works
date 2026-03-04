package oop_126847_ZahraAriestya.week05

abstract class PaymentMethod(val accountName: String) {
    // Abstract function yang wajib di-override oleh semua class anak
    abstract fun processPayment(amount: Double)
}