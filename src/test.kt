fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)
}
