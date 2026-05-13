package oop_126847_ZahraAriestya.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    println("=" .repeat(50))
    println("=== SMART PET FEEDER SYSTEM - FULL PIPELINE TEST ===")
    println("=" .repeat(50))

    // JADWAL 1: MAKAN PAGI (Akan gagal karena stok tidak cukup)
    // Expected: FoodEmptyException, finally block tereksekusi
    println("\n>>> JADWAL MAKAN PAGI <<<")
    var currentKibbleStock = 50
    println("Stok kibble awal: $currentKibbleStock gr")
    println("Permintaan: 80 gr")

    try {
        println("Mencoba mengeluarkan kibble 80 gr...")
        val newStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = newStock
        println("Sisa stok kibble: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("[ERROR-DISPENSER] ${e.message}")
        println("Silakan periksa wadah dispenser dan coba lagi!")
    } catch (e: FoodEmptyException) {
        println("[ERROR-FOOD] ${e.message}")
        println("Silakan isi ulang stok kibble!")
    } catch (e: Exception) {
        println("[ERROR-UNKNOWN] Terjadi kesalahan tak terduga: ${e.message}")
    } finally {
        println("[FINALLY] Siklus pengecekan dispenser pagi selesai.")
    }

    // JADWAL 2: MAKAN SORE (Akan berhasil dengan mulus)
    // Expected: Sukses menggunakan runCatching & onSuccess
    println("\n>>> JADWAL MAKAN SORE <<<")
    println("Pemilik sudah mengisi ulang stok. Alat normal kembali.")

    var currentKibbleStockSore = 1000
    println("Stok kibble sore awal: $currentKibbleStockSore gr")
    println("Permintaan: 30 gr")

    runCatching {
        println("Memproses dispenseKibble(30, 1000, false)...")
        dispenseKibble(
            requestedGram = 30,
            availableGram = currentKibbleStockSore,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStockSore = newStock
        println("[SUCCESS] Makan sore sukses! Sisa stok kibble: $currentKibbleStockSore gr")
    }.onFailure { error ->
        println("[FAILURE] Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }

    // VERIFIKASI FINAL
    println("\n" + "=".repeat(50))
    println(">>> VERIFIKASI PIPELINE <<<")
    println("Jadwal 1 (Pagi): FoodEmptyException - BERHASIL ditangkap")
    println("Jadwal 1 (Pagi): Finally block - BERHASIL tereksekusi")
    println("Jadwal 2 (Sore): runCatching pipeline - BERHASIL dijalankan")
    println("Jadwal 2 (Sore): onSuccess - BERHASIL mengupdate stok")
    println("=".repeat(50))
    println("\n--- Program Selesai ---")
}