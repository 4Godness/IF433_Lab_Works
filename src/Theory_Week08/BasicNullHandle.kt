package Theory_Week08

class set_krs(val nim:String, val kodematkul:String?){
    fun matkul_wajib(sks:Int?) {
        println("matkul kamu $kodematkul sks-nya adalah $sks");
    }
}

fun main() {
    var nama:String? = "Ariestya";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs( nim = "123", kodematkul = "null");
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null);
}