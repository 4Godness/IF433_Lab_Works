package Theory_Week04

open class Makanan {
    private var namaResto:String = " ";
    protected var harga:Int = 0;
    protected var stock:Int = 10;

    init {
        namaResto = "Steak 12";
        println("Resto saya $namaResto")
    }
    open public fun jual_makanan() {
        println("Saya jual makanan");
    }
}