package Theory_Week03

open class Bapake {

    private var nama:String = "Belum tau";
    private var umur:Int = 35;
    protected var gaji:Int = 1000;

    public var uangjajan:Int = 0
    set(value) {2
        if (value < 0) {
            println("Masa uang jajan 0 atau minus");
        } else {
            field = value;
        }
    }
    get(){
        return field + 123;
    }

    public fun set_nama(namabaru:String) {
        if(namabaru.length <= 0) {
            println("Ini nama ga bole kosong");
        } else{
            this.nama = namabaru;
        }
    }

    public fun get_nama():String{
        return this.nama;
    }

    public fun set_umur(umurbaru:Int) {
        if(umurbaru < 0) {
            println("Umur tidak boleh minus");
        } else{
            this.umur = umurbaru;
        }
    }

    public fun get_umur():Int{
        return this.umur;
    }
}

class Anake: Bapake() {
    fun dapetin_gaji_bapak(): Int {
        this.gaji = 5500;
        return this.gaji + 100;
    }
}

fun main() {

    var bpk = Bapake();
    bpk.set_nama("Yanto");
    bpk.set_umur(-5);
    println("Nama papi kamu: ${bpk.get_nama()}");
    println("Umur papi kamu: ${bpk.get_umur()}");

    var ank = Anake();
    ank.set_nama("Asep");
    println("Nama kamu: ${ank.get_nama()}");
    println("Gaji bapak: "+ ank.dapetin_gaji_bapak());

    ank.uangjajan = 100;
}
