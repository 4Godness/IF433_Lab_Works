package Theory_Week06

interface Organisasi {
    val namaOrg: String;
    val budgetRapat:Int;
    val jmlOrg:Int;
    val biayakonsumsi:Int
        get() = budgetRapat * jmlOrg

    fun rapat();
    fun keaktifan(){
        println("Ih kamu aktif")
    }

}