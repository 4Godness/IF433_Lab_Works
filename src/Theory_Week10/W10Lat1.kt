package Theory_Week10

//class non-generic
class rumah(var alamat:Any)

//class generic
class kampus<T>(val alamat:T)

//coe generic Multiple Parameter
class komputer <Z, V>(val merk:Z, val barcode:V)

//code generic function
fun <T> Password(IsiPass:T):T {
    return IsiPass
}

//code generic constraint
class Kalkulator<T: Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

// generic - where
fun <T> penilaian(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it >= kkm}
}

fun main() {
    println("==== SAMPLE GENERIC - Where ====")
    val daftarNilai = listOf(80,74,66,67)
    println("Daftar Nilai: " + daftarNilai);
    val nilaiAtasKKM = penilaian( list = daftarNilai, kkm =70)
    println("Nilai diatas KKM: " + nilaiAtasKKM);

    println("==== SAMPLE GENERIC - Constraint ====")
    val kalk = Kalkulator(15.33,22.47)
    println("penambahan ${kalk.a} ditambah ${kalk.b} " + kalk.tambah());
    println("pengurangan ${kalk.a} ditambah ${kalk.b} " + kalk.kurang());

    println("==== SAMPLE GENERIC - Function ====")
    println("Password kamu: " + Password( IsiPass = "12345"));

    println("==== SAMPLE GENERIC - Multi Parameter ====")
    val komp = komputer(merk = "Dell", barcode= "Ayasha12345")
    println("Merk Komputer: " + komp.merk)
    println("Barcode Komputer: ${komp.barcode}")

    println("==== SAMPLE NON-GENERIC ====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("==== SAMPLE GENERIC ====")
    val kmps = kampus(alamat = 200)
    println(kmps.alamat + 50)
}
