package oop_126847_ZahraAriestya.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100   // Default HP
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName dengan damage $baseDamage!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}
