package Theory_Week07

fun main() {
    Koneksi.LinkServer = "dameyo";
    println("Server: ${Koneksi.LinkServer}");
    Koneksi.test_koneksi();

    Mahasiswa.nama = "udin";
    val na: Int = Mahasiswa.set_nilai(80, 100);
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "UMN")

    val dsn1 = Dosen(nama = "Indah", nik = "12345", tahunMasuk = 2010);
    println(dsn1);
    val dsn2 = dsn1.copy(nama = "Budi", nik = "32154");
    println(dsn2);

    //CARA AMBIL DATA SATUAN
    println("Nama dosen: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println("Matkul fav saya: " + MataKuliah.OOP);
    println("Index matkul: " + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    //LOOPING MUNCULIN SEMUA
    for(matkul in MataKuliah.entries) {
        print("matkul: " + matkul + "");
        matkul.sks_matkul();
    }
}