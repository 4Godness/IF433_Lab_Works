package Theory_Week08


class Alamat(val nomor:Int, val kota:String);
class Mahasiswa(val nim:String, val addr:Alamat?);

fun main(){0
    val almt = Alamat(nomor = 47, kota="Tangerang");
    val mhs = Mahasiswa( nim = "12345", addr = almt)

    val defaultAlamat = mhs.addr?. let{
        alamatAsli -> "sini nih...${mhs.addr.kota} nomornya ${mhs.addr.nomor}";
    }?:"Gak jelas, ga tau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}