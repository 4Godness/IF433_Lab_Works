package oop_126847_ZahraAriestya.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    println("╔══════════════════════════════════════╗")
    println("║     SMART HOME SYSTEM - FINAL TEST   ║")
    println("╚══════════════════════════════════════╝")

    // 1. INSTANSIASI DEVICE (sama seperti CP 19)
    println("\n【STEP 1】Membuat Smart Devices...")
    val lampRuangTamu = SmartLamp("L001", "Lampu Ruang Tamu")
    val speakerDapur = SmartSpeaker("S001", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C001", "Ezviz Garasi")

    println("✅ Devices siap:")
    println("   • ${lampRuangTamu.name} (${lampRuangTamu.id})")
    println("   • ${speakerDapur.name} (${speakerDapur.id})")
    println("   • ${cctvGarasi.name} (${cctvGarasi.id})")

    // 2. BUAT HUB DAN TAMBAHKAN DEVICE
    println("\n【STEP 2】Inisialisasi SmartHomeHub...")
    val hub = SmartHomeHub()
    hub.addDevice(lampRuangTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)
    println("✅ Semua device ditambahkan ke hub")

    // 3. TEST SECURITY MODE (dengan smart casting)
    println("\n【STEP 3】Mengaktifkan Security Mode...")
    println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    hub.activateSecurityMode()

    // 4. TEST TURN OFF ALL SWITCHES
    println("\n【STEP 4】Mematikan semua perangkat...")
    println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    hub.turnOffAllSwitches()

    // 5. TEST INTERAKSI MANUAL (opsional, untuk demonstrasi)
    println("\n【STEP 5】Demonstrasi Interaksi Manual...")
    println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    println("Menyalakan CCTV Garasi dari remote:")
    cctvGarasi.turnOn()

    println("\nMemutar musik di Google Nest Dapur:")
    speakerDapur.turnOn()
    speakerDapur.playMusic("Indonesia Raya")

    println("\nMematikan semua dari hub:")
    hub.turnOffAllSwitches()

    // 6. SUMMARY
    println("\n╔══════════════════════════════════════╗")
    println("║     TEST SELESAI - SEMUA SUKSES!    ║")
    println("╚══════════════════════════════════════╝")
    println("✅ CP 19: Instansiasi device berhasil")
    println("✅ CP 20: Test sistem lengkap berhasil")
    println("✅ Smart casting bekerja dengan baik")
    println("✅ Polymorphism terimplementasi dengan benar")
}