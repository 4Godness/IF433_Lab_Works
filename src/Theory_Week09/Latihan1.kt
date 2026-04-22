package Theory_Week09

fun main() {
    println("====== LIST OF IMUT ======");
    val arSiswa = listOf("Budi", "Danu", "Siti", "Rara");
    //view
    println("banyak siswa: " + arSiswa.size);
    // munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}");
    // munculin semua orang pakai for each
    for (a in arSiswa) {
        print("Siswa " + a + " dan ");
    }

    println("====== LIST OF MUTABLE ======");
    val arMatkul = mutableListOf("OOP", "PemWeb", "MatDis", "Kalkulus");
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove(element = "Kalkulus");
    println(arMatkul);

    println("====== SET OF IMUT ======");
    //yang double atau duplicate hanya muncul sekali
    val arNilai = setOf("80", "77", "90", "40", "67", "85", "77");
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains("90")}");
    println(arNilai);

    println("====== SET OF MUTABLE ======");
    val arMahasiswa = mutableSetOf("Adi", "Yuda", "Udin", "Yanto")
    arMahasiswa.add("Yanti");
    arMahasiswa.remove(element = "Udin");
    arMahasiswa.add("Udin");
    print(arMahasiswa);

    println("====== MAP IMUT ======");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Udang" to 10000,
        "Bakpao" to 8000
    )
    println("Banyak menu ${arResto.size}");
    println("Harga ayam ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("List harga: ${arResto.values}");
    println(arResto);

    println("====== MAP MUTABLE ======");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    )
    arKHS.remove(key = "Ara");
    arKHS["Nika"] = 92
    arKHS["nyoba"] = 99
    println(arKHS);

    println("====== LAMBDA ======");
    fun tambah(a: Int, b: Int): Int {
        return a + b;
    }
    println("Hasil penambahan ${tambah(a=1, b=2)}");

    val kurang = {a: Int, b: Int -> a - b }
    println("Hasil pengurangan ${kurang(5,2)}");

    println("====== LAMBDA (IT) ======");
    val pangkat = {a: Int -> a+a }
    val hasilPangkat:(Int) -> Int = {it * it}
    println("Hasil pangkat ${hasilPangkat(5)}");

    println("====== FOREACH BIASA ======");
    for(a in arMatkul){
        println(a);
    }

    println("====== FOREACH IT ======");
    arMatkul.forEach {
        println(it);
    }

    println("====== FOREACH VARIABEL ======");
    arMatkul.forEach {
        mk -> println(mk);
    }
}