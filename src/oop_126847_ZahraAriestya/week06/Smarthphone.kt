package oop_126847_ZahraAriestya.week06

class Smarthphone: Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Camera>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}