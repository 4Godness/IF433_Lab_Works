package Theory_Week02

class Pemain {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;  //Reference or Stack

    // Heap, all class dipanggil bisa (Objects)
    // Tidak punya Parameter namun jalan pertama
    init {
        this.nama = "Messi";
        println("Ini adalah constructor");
    }
 //Second Constructor punya Parameter
    constructor(alias:String="Budi", kecepatan:Int=2) {
        nama = alias;
        speed = kecepatan;
        println("Ini constructor kedua");
    }

    fun bawa_bola() {
        println("si $nama sedang bawa bola");
    }
}

fun main(){
    val player = Pemain();
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill kecepatan: " + player.speed);

    // 2 Parameter can use 1 class
    val player2 = Pemain( alias = "Ronaldo", 99);
    println("pemain Populer: ${player2.nama}");
    println("Kecepatan: " + player2.speed);
}