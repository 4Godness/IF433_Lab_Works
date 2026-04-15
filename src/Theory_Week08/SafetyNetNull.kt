package Theory_Week08


fun main() {
    var nama:String? = null;

    try {
        println("nama kamu ${nama!!.uppercase()}")
        val hitungan = 10/0;
    } catch(ex: Exception) {
        println("errornya adalah ${ex.message}");
    }

    var dataMhs: List<Any> = listOf(123, "Sheyla", 89, "Tangerang")
    for(item in dataMhs) {
        var itemfilter = item as? String
        if (itemfilter != null) {
            println(item)
        }
    }
}