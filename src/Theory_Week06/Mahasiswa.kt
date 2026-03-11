package Theory_Week06

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMK: String,
    override val nilaiMK: Int

    ) : Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namaOrg");
        print("Biaya konsumsi rapat: ${super.biayakonsumsi}");
    }
    override fun penilaian() {
        println("Nilai $namaMK adalah 80")
    }
    override fun keaktifan() {
        super<KelasMK>.keaktifan()
        super<Organisasi>.keaktifan()
    }
}