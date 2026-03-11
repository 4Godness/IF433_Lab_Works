package oop_126847_ZahraAriestya.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smarthphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout( method = pay1, amount = 50000.0)
    processCheckout( method = pay2, amount = 150000.0)

    println("=== CHECKPOINT 19: Instansiasi Smart Devices ===")

    // Instansiasi 3 device sesuai perintah modul
    val lampRuangTamu = SmartLamp("L001", "Lampu Ruang Tamu")
    val speakerDapur = SmartSpeaker("S001", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C001", "Ezviz Garasi")

    // Tampilkan informasi device yang telah dibuat
    println("✅ Berhasil membuat 3 smart devices:")
    println("   - ${lampRuangTamu.name} (ID: ${lampRuangTamu.id})")
    println("   - ${speakerDapur.name} (ID: ${speakerDapur.id})")
    println("   - ${cctvGarasi.name} (ID: ${cctvGarasi.id})")

    // Test masing-masing device secara manual
    println("\n--- Testing Device Functions ---")
    lampRuangTamu.turnOn()
    lampRuangTamu.turnOff()

    speakerDapur.turnOn()
    speakerDapur.playMusic("Shape of You - Ed Sheeran")
    speakerDapur.turnOff()

    cctvGarasi.turnOn()  // Ini otomatis memanggil startRecord()
    cctvGarasi.turnOff()
}