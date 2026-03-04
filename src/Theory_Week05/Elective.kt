package Theory_Week05

class Elective: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming";
        println("Elektif ${super.nama} sks $sks")
    }
    fun ada_praktek() {
        println("Wajib di praktekin");
    }
}