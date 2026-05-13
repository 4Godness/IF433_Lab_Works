package oop_126847_ZahraAriestya.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    // Jika semua aman, cetak pesan dan return sisa stok
    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}