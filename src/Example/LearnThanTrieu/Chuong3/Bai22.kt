package Example.LearnThanTrieu.Chuong3

import kotlin.math.sqrt

fun main() {
    println("Nhập so luong bo test: ")
    val t = readln().toInt()
    for (i in 1..t){
        val n = readln().toInt()
        if (n < 2){
            println("Test $i: NO")
        }else{
            var isPrime = true
            val bound = sqrt(n.toDouble()).toInt()
            for (j in 2..bound) {
                if(n % j == 0) {
                    isPrime = false
                    break
                }
            }
            val result = if (isPrime){
                "Test $i: YES"
            }else{
                "Test $i: NO"
            }
            println(result)
        }

    }
}