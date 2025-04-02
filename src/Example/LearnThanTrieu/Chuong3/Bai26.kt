package Example.LearnThanTrieu.Chuong3

fun main() {
    println("Nhap so luong bo test: ")
    val t = readln().toInt()
    for (i in 1..t) {
        val n = readln().toInt()
        if (n < 0) {
            println("Test $i: INVALID")
        } else if (n >= 93) {
            println("Test $i: OVERFLOW")
        } else {
            val result = if (n >= 2) {
                var f0 = 0L
                var f1 = 1L
                var fn: Long = 0
                for (item in 2..n) {
                    fn = f0 + f1
                    f0 = f1
                    f1 = fn
                }
                "Test $i: $fn"
            } else {
                "Test $i: $n"
            }
            println(result)
        }
    }
}