package Theory_Week05

abstract class Matakuliah {
    var nama:String = "";
    abstract fun set_matkul(sks:Int);
    fun hasil_matkul(){
        println("Matkul diminati");
    }
}