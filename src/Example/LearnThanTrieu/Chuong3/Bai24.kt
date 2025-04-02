package Example.LearnThanTrieu.Chuong3


fun main() {
    println("Nhap so luong bo test: ")
    val t = readln().toInt()
    for(i in 1..t){
        val n = readln().toInt()
        if (n < 0){
            println("Test $i: INVALID")
        }else{
            var m = n
            var sum = 0
            while (m > 0){
                sum += m %10
                m /= 10
            }
            println("Test $i: $sum")
        }
    }
}