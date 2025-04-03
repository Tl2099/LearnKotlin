package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Nhap so luong bo test: ")
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val n = readln().toInt()
        println("Test $testCounter: ${getFibonacciNumber(n)}")
        t--
        testCounter++
    }
}

fun getFibonacciNumber(n: Int): String{
    if(n < 0){
        return "INVALID"
    }else if (n >= 93){
        return "OVERFLOW"
    }else{
        var f0 = 0L
        var f1 = 1L
        var fn = 0L
        for (number in 2..n){
            fn = f0 + f1
            f0 = f1
            f1 = fn
        }
        return fn.toString()
    }
}