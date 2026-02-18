package oop_126847_ZahraAriestya.week03

class Player(val username: String) {
    private var xp: Int = 0  // Dimulai dari 0, tidak bisa diakses langsung dari luar

    val level: Int
        get() = (xp / 100) + 1  // Computed property: (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("Peringatan: Jumlah XP harus positif!")
            return
        }

        val levelSebelum = level
        xp += amount
        val levelSesudah = level

        println("$username mendapat $amount XP. Total XP: $xp")

        if (levelSesudah > levelSebelum) {
            println("Level Up! Selamat $username naik ke level $levelSesudah")
        }
    }
}