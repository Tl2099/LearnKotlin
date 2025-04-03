package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    println("Nhap so luong bo test: ")
    val t = readln().toInt()
    for (i in 1..t) {
        val n = readln().toInt()
        if (n < 0) {
            println("Test $i: INVALID")
        } else {
            var m = n
            var product = if (m == 0) 0 else 1
            while (m > 0) {
                product *= (m % 10)
                m /= 10
            }
            println("Test $i: $product")
        }
    }
}