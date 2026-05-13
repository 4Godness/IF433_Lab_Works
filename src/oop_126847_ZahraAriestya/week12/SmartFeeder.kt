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

fun main() {
    println("=== SMART PET FEEDER SYSTEM ===")

    // Variabel awal stok kibble = 50 gram
    var currentKibbleStock = 50
    println("Stok kibble awal: $currentKibbleStock gr")
    println("\n=== JADWAL MAKAN PAGI ===")

    try {
        println("Mencoba mengeluarkan kibble 80gr")
        val newStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = newStock
        println("Sisa stok kibble: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("[ERROR] ${e.message}")
        println("Silahkan periksa wadah dispenser dan coba lagi!")
    } catch (e: FoodEmptyException) {
        println("[ERROR] ${e.message}")
        println("Silakan isi ulang stok kibble!")

    } catch (e: Exception) {
        println("[ERROR] Terjadi kesalahan tak terduga: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n--- Program Selesai ---")
}
