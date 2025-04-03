package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Nhap so luong bo test: ")
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val input = readln().split("\\s+".toRegex())
        val n = input[0].toLong()
        val k = input[1].toLong()
        println("Test $testCounter: ")
        listNumberDivideByK(n,k)
        t--
        testCounter++
    }
}

fun listNumberDivideByK(n: Long, k: Long){
    if(n < 0 || k <= 0 || n > pow(10, 8) || k > pow(10, 8)){
        println("INVALID")
    }else{
        for (x in 1..n){
            if(x % k == 0L){
                print("$x ")
            }
        }
        println()
    }
}