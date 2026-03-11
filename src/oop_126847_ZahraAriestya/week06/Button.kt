package oop_126847_ZahraAriestya.week06

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol `$name` berhasil diklik!")
    }
}