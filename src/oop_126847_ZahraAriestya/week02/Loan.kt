package oop_126847_ZahraAriestya.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1   // Default 1 hari
) {

    // Durasi Loan
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

