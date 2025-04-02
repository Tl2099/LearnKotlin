package Example.LearnThanTrieu.Chuong3

import kotlin.math.sqrt

fun main() {
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0) {
        t--
        val n = readln().toInt()
        val bound = sqrt(n.toDouble()).toInt()
        var isPrime: Boolean
        if (n >= 2) {
            isPrime = true
            for (number in 2..bound) {
                if (n % number == 0) {
                    isPrime = false
                    break
                }
            }
        } else {
            isPrime = false
        }
        val result = if (isPrime) "YES" else "NO"
        println("Test ${testCounter++}: $result")
    }
}