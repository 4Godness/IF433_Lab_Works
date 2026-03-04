package oop_126847_ZahraAriestya.week05

fun main() {
    // ========== BAGIAN 1: DEMO POLYMORPHIC COLLECTION & SMART CASTING ==========
    println("==========================================")
    println("DEMO POLYMORPHIC COLLECTION & SMART CASTING")
    println("==========================================\n")

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n\n")

    // ========== BAGIAN 2: TUGAS MANDIRI 1 - COMPILE-TIME POLYMORPHISM ==========
    println("==========================================")
    println("TUGAS MANDIRI 1: COMPILE-TIME POLYMORPHISM")
    println("============= (METHOD OVERLOADING) =============\n")

    // Membuat objek MathHelper
    val mathHelper = MathHelper()

    println("\n1. Menghitung Luas Persegi")
    println("---------------------------")
    val sisiPersegi = 5
    val luasPersegi = mathHelper.hitungLuas(sisiPersegi)
    println("Sisi persegi: $sisiPersegi")
    println("Luas persegi (sisi x sisi): $luasPersegi")

    println("\n2. Menghitung Luas Persegi Panjang")
    println("-----------------------------------")
    val panjang = 8
    val lebar = 4
    val luasPersegiPanjang = mathHelper.hitungLuas(panjang, lebar)
    println("Panjang: $panjang, Lebar: $lebar")
    println("Luas persegi panjang (panjang x lebar): $luasPersegiPanjang")

    println("\n3. Menghitung Luas Lingkaran")
    println("----------------------------")
    val jariJari = 7.0
    val luasLingkaran = mathHelper.hitungLuas(jariJari)
    println("Jari-jari lingkaran: $jariJari")
    println("Luas lingkaran (3.14 x r x r): $luasLingkaran")

    println("\n========== KESIMPULAN ==========")
    println("Method overloading memungkinkan:")
    println("• Nama fungsi sama: hitungLuas()")
    println("• Parameter berbeda: (Int), (Int, Int), (Double)")
    println("• Kotlin secara otomatis memanggil fungsi")
    println("  yang sesuai berdasarkan argumen yang diberikan")
    println("=================================")

    // Demonstrasi tambahan: compile-time resolution
    println("\n=== DEMO COMPILE-TIME RESOLUTION ===")
    println("Memanggil hitungLuas(10) -> otomatis memilih versi persegi")
    println("Hasil: ${mathHelper.hitungLuas(10)}")
    println("Memanggil hitungLuas(6, 3) -> otomatis memilih versi persegi panjang")
    println("Hasil: ${mathHelper.hitungLuas(6, 3)}")
    println("Memanggil hitungLuas(5.0) -> otomatis memilih versi lingkaran")
    println("Hasil: ${mathHelper.hitungLuas(5.0)}")

    println("\n\n")

    // ========== BAGIAN 3: TUGAS MANDIRI 2 - SISTEM PEMBAYARAN ==========
    println("==========================================")
    println("TUGAS MANDIRI 2: SISTEM PEMBAYARAN")
    println("===== (ABSTRACTION & SMART CASTING) =====\n")

    // Membuat objek EWallet dan CreditCard
    val eWallet = EWallet(accountName = "Zahra Ariestya", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Zahra Ariestya", limit = 100000.0)

    // Memasukkan ke dalam list bertipe PaymentMethod (Polymorphic Collection)
    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== DEMO PAYMENT POLYMORPHISM ===")
    println("Melakukan pembayaran sebesar Rp75.000 menggunakan kedua metode:\n")

    // Melakukan perulangan untuk memproses pembayaran
    for ((index, metode) in daftarPembayaran.withIndex()) {
        println("METODE PEMBAYARAN #${index + 1}")
        println("--------------------------------")
        metode.processPayment(75000.0)
        println("--------------------------------\n")
    }

    // ========== BAGIAN 4: SMART CASTING CHALLENGE ==========
    println("\n=== SMART CASTING CHALLENGE ===")
    println("Mendeteksi metode pembayaran dan melakukan top up untuk EWallet:\n")

// Melakukan perulangan kedua dengan smart casting
    for ((index, metode) in daftarPembayaran.withIndex()) {
        println("METODE PEMBAYARAN #${index + 1}")
        println("--------------------------------")

        // Smart casting dengan 'is' operator
        when (metode) {
            is EWallet -> {
                println("✅ Terdeteksi sebagai E-Wallet (Account: ${metode.accountName})")
                println("Status: Transaksi pertama gagal karena saldo tidak cukup!")
                println("Saldo saat ini: Rp${String.format("%.0f", metode.balance)}")

                // Melakukan top up
                println("\n🔄 Melakukan pemulihan dengan top up...")
                metode.topUp(50000.0)

                // Mencoba proses pembayaran lagi setelah top up
                println("\n🔄 Mencoba proses pembayaran lagi...")
                metode.processPayment(75000.0)
            }
            is CreditCard -> {
                println("✅ Terdeteksi sebagai Credit Card (Account: ${metode.accountName})")
                println("Status: Transaksi pertama berhasil dalam limit")
                println("Limit: Rp${String.format("%.0f", metode.limit)}")
                println("Jumlah terpakai: Rp${String.format("%.0f", metode.usedAmount)}")
            }
        }
        println("--------------------------------\n")
    }

    println("\n========== KESIMPULAN SISTEM PEMBAYARAN ==========")
    println("✅ Polymorphic Collection: List<PaymentMethod> berisi")
    println("   objek EWallet dan CreditCard")
    println("✅ Abstraction: PaymentMethod sebagai abstract class")
    println("   dengan abstract function processPayment()")
    println("✅ Smart Casting: 'is' operator digunakan untuk")
    println("   mendeteksi tipe dan mengakses fungsi spesifik")
    println("==================================================")
}