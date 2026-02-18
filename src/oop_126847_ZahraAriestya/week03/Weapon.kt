package oop_126847_ZahraAriestya.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai damage tetap ${field}")
                return
            }
            if (value > 1000) {
                println("Peringatan: Damage terlalu tinggi! Dibatasi menjadi 1000")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}