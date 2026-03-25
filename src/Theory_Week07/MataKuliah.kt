package Theory_Week07

enum class MataKuliah(val jmlSks:Int) {
    OOP(jmlSks = 3),
    GAMEDEV(jmlSks = 4),
    DASPRO(jmlSks = 2);

    fun sks_matkul() {
        println("Jml sksnya: $jmlSks")
    }
}