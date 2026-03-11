package oop_126847_ZahraAriestya.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name ($id) menyala.")
        startRecord() // otomatis merekam saat menyala
    }

    override fun turnOff() {
        println("CCTV $name ($id) mati.")
    }

    override fun startRecord() {
        println("CCTV $name ($id) mulai merekam...")
    }
}