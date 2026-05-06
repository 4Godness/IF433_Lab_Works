package Theory_Week11

// FUNCTION BIASA
fun panggil_nama(nama: String): String {
    return "Hai $nama"
}

// EXTENSION BASIC - BASIC
fun String.panggil_mahasiswa(): String {
    val hasil = this.split(" ").joinToString("") {
        it.replaceFirstChar { c ->
            c.uppercase()
        }
    }
    return hasil
}

// FUNCTION EXTENSION PARAMETER
fun Int.tentukankelulusan(nama: String): String {
    val keputusan = if (this >= 70) {
        "Lulus"
    } else {
        "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

// FUN EXTENSION NULL
fun String?.cekNulldanEmpty(): String {
    return if (this == null || this.isEmpty()) {
        "gak boleh null atau kosong dek"
    } else {
        "username kamu adalah $this"
    }
}

class Mahasiswa(){
    var NIM:String = ""
    var Nama:String = ""
    var IPK:Int = 0
}

fun main() {

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        NIM = "121212"
        Nama = "Ayasha"
        IPK = 4
    }
    println("Mahasiswa ${dataMahasiswa.Nama} dgn NIM ${dataMahasiswa.NIM} IPK nya ${dataMahasiswa.IPK}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(88, 98, 45, 34, 76, 64)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(77)
    println("Setelah $deretAngka")

    // SCOPE - WITH
    val gradeSaya = with(90) {
        if (this >= 88) {
            "A"
        } else if (this >= 70) {
            "B"
        } else {
            "C"
        }
    }
    println("Grade saya: $gradeSaya") // <-- sebelumnya belum ditampilkan

    // SCOPE - LET
    val kampusSaya = "UMN"
    kampusSaya.let {
        if (it == "UMN") {
            println("Kampus $it Sugoi")
        } else {
            println("Bukan $it")
        }
    }

    // SCOPE - RUN
    val alamatSaya = "Bonang"
    alamatSaya.run {
        println("Saya tinggal di $this") // <-- FIX ERROR di sini
    }

    // CALL FUNCTION EXTENSION NULL
    val inputUsername: String? = null
    println(inputUsername.cekNulldanEmpty())

    // CALL FUNCTION EXTENSION PARAMETER
    println(80.tentukankelulusan(nama = "Revand"))

    // CALL BASIC FUNCTION
    println(panggil_nama("Toni").uppercase())

    // CALL EXTENSION FUNCTION BASIC
    println("tony stark".panggil_mahasiswa())
}