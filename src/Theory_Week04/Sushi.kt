package Theory_Week04

class Sushi:Makanan() {
    var jenis:String = "";
    public fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns;
        super.harga = jml * 100;
        println("Sushi $jenis laku $harga")
    }
}