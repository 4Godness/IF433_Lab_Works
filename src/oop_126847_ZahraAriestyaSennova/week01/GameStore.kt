fun main() {
    val gameTitle = "Elden Ring"
    val price = 650000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 80) / 100
    } else {
        (price * 90) / 100
    }


fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== SteamKW Digital Receipt ===")
    println("Judul Game   : $title")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}

