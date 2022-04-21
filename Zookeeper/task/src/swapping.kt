fun main() {
//    val obj = readln()


    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Write only exchange actions here. Do not touch the lines above

//    run { val temp = a; a = b; b = temp }

//    with(a) {
//        a = b
//        b = this
//    }

    a = b.also { b = a }

    // Do not touch the lines below
    println("$a $b")
    println("^".hashCode())
}