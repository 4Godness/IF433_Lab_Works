package Theory_Week05

fun main() {
    val ListMatkul:List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    );
    println("Banyak tipe matkul: $ListMatkul");

    for(mku in ListMatkul){
        mku.set_matkul(3);
        // cara ke-1 panggil method yg berbeda all class
        if(mku is Wajib) {
            mku.ada_seminar();
        }
        else if(mku is Elective) {
            mku.ada_praktek();
        }
        //cara ke-2 panggil method berbeda all class
        when(mku){
            is Wajib -> {
                println("Wajib dari When");
                mku.ada_seminar();
            }
            is Elective -> {
                println("Elective dari When");
                mku.ada_praktek();
            }
        }
    }

}
