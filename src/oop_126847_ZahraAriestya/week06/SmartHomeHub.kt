package oop_126847_ZahraAriestya.week06

class SmartHomeHub {
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("=== Mematikan semua perangkat switchable ===")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("=== AKTIVASI MODUS KEAMANAN ===")
        for (device in devices) {
            when (device) {
                is Recordable -> {
                    println("  [Security] Mendeteksi device Recordable:")
                    device.startRecord()
                }
                is SmartSpeaker -> {
                    println("  [Security] Mendeteksi SmartSpeaker:")
                    device.playMusic("Sirine Peringatan - WARNING!")
                }
                else -> {
                    println("  [Security] ${device.name} tidak merespon mode keamanan")
                }
            }
        }
    }
}