package Theory_Week12

fun pembagian(pembilang:Int, penyebut:Int) {
    try {
    val hasilBagi = pembilang / penyebut;
    println("hasil bagi: $hasilBagi")
    } catch (e: Exception) {
    println("Error pembagian: ${e.message}")
    } finally {
        println("Selesai Pembagian")
    }
}

fun cek_tipe_data() {
    var angka:Int = try {
        Integer.parseInt("10");
    } catch (e: Exception) {
        println("Ada error di CekTipeData ${e.message}");
        111
    }
    println("Angka kamu adalah ${angka}")
}

fun cek_saldo(saldoSaya:Int) {
    if(saldoSaya<1000) {
        throw IllegalArgumentException("Saldo ${saldoSaya}! tidak perlu bayar pajak")
    } else {
        println("Selamat kamu terdaftar dalam BCA Prioritas")
    }

}

//custom exception
class CekNilaiKKM(val kkm:Int, val nilai:Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm:Int) {
    fun input_nilai( nilaiKamu:Int) {
        if(nilaiKamu < kkm) {
            throw CekNilaiKKM(kkm, nilaiKamu);
        } else {
            println("Kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}

//contoh multiple catch
fun contoh_multiple_catch(nilai:String) {
    try {
        val angka = Integer.parseInt(nilai)
        val hasil = angka/2
        println("Hasil nilainya: $hasil")
        cek_saldo(saldoSaya=100)
    } catch (e: NumberFormatException) {
        println("Error salah format ${e.message}")
    } catch (e:ArithmeticException) {
        println("Error kesalahan Aritmatika ${e.message}")
    } catch (e: Exception) {
        println(message = "Error Program : ${e.message}")
    }
}

fun main() {
    contoh_multiple_catch(nilai = "100")
    val nsiswa = nilai_siswa(kkm = 70)
    nsiswa.input_nilai(nilaiKamu = 71)
    try {
        nsiswa.input_nilai(nilaiKamu = 68)
    } catch (e: Exception) {
        println("Ada error saat input nilai siswa ${e.message}")
    }

    //Throw
    try {
        cek_saldo(saldoSaya = 900)
    } catch (e: Exception) {
        println("Error diThrow: ${e.message}")
    }

    cek_tipe_data()
    pembagian(pembilang = 10, penyebut = 10)
}
