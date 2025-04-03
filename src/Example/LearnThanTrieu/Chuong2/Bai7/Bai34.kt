package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main() {
    val testNumber = readln().toInt()
    if(testNumber in 1..100){
        for (test in 1..testNumber){
            val n = readln().toIntOrNull()
            var result = ""
            if(n == null || n < 2){
                result = "NO"
            }else{
                val upperBound = sqrt(n.toDouble()).toInt()
                var isPrimeNumber = true
                var i = 2
                while (i <= upperBound){
                    if(n % i == 0){
                        isPrimeNumber = false
                        break
                    }
                    i++
                }
                result = if (isPrimeNumber) "YES" else "NO"
            }
            println("Test $test: $result")
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}