package oop_126847_ZahraAriestya.week05

class MathHelper {

    // Fungsi overloading 1: Menghitung luas persegi
    // Parameter: sisi (Int)
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Fungsi overloading 2: Menghitung luas persegi panjang
    // Parameter: panjang (Int), lebar (Int)
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Fungsi overloading 3: Menghitung luas lingkaran
    // Parameter: jariJari (Double)
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }

    // Fungsi tambahan untuk menampilkan hasil dengan format yang rapi
    fun tampilkanHasil() {
        println("MathHelper - Method Overloading Demo")
        println("=====================================")
    }
}