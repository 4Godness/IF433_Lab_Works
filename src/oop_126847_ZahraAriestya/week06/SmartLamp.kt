package oop_126847_ZahraAriestya.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name ($id) menyala terang.")
    }

    override fun turnOff() {
        println("Lampu $name ($id) mati.")
    }
}