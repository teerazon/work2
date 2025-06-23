fun main(){
    Kop()


}
fun Kop(){
    var kint: Int = 20_000
    var kboo: Boolean = true
    var kstr: String = "class24"
    var kdo: Double = 200.33
    var ka: Any = "class"
    //op
    var a: Double = 3.0
    var b: Double = 4.0

    println(kint)
    println(kboo)
    println(kstr)
    println(kdo)
    println(ka)
    println("$kint\n" +
            "$kboo\n" +
            "$kstr\n" +
            "$kdo\n" +
            "$ka"
            )
    println(a%b)
    var x: Int = 10
    var y: Int = 10
    x++
    println(x) // 11
    ++y
    println(y) // 11
}