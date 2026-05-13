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
    println("=== SMART PET FEEDER SYSTEM ===")

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

    println("\n=== JADWAL MAKAN SORE ===")
    println("Pemilik sudah mengisi ulang stok. Alat normal kembali.")

    val result = runCatching {
        println("Mencoba mengeluarkan kibble 30 gr dari stok 1000 gr...")
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }

    result.onSuccess { newStock ->
        println("Sukses! Sisa stok kibble: $newStock gr")
    }.onFailure { exception ->
        when (exception) {
            is DispenserJamException -> println("Gagal: ${exception.message}")
            is FoodEmptyException -> println("Gagal: ${exception.message}")
            is IllegalArgumentException -> println("Gagal: ${exception.message}")
            else -> println("Gagal: Terjadi error tak terduga - ${exception.message}")
        }
    }

    val finalStock = result.getOrElse { 1000 }
    println("Stok akhir setelah jadwal sore: $finalStock gr")

    println("\n--- Program Selesai ---")
}