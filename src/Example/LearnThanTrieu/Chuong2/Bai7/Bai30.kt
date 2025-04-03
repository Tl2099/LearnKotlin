package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main() {
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val inputs = readln().split("\\s+".toRegex())
        val n = inputs[0].toInt()
        val m = inputs[1].toInt()
        print("Test ${testCounter++}: ")
        if(n > 0 && m > 0){
            var sum = 0
            var sum2 = 0
            val bound = sqrt(n.toDouble()).toInt()
            val bound2 = sqrt(m.toDouble()).toInt()
            for (x in 1..bound){
                if(n % x == 0){
                    sum += x
                }
            }
            for (x in 1..bound2){
                if(m % x == 0){
                    sum2 += x
                }
            }
            for (x in bound downTo 1){
                val other = n / x
                if(n % x == 0 && other != x){
                    sum += other
                }
            }
            for (x in bound2 downTo 1){
                val other2 = m/x
                if(m % x == 0 && other2 != x){
                    sum2 += other2
                }
            }

            sum -= n
            sum2 -= m
            val result = if(sum == m && sum2 == n) "YES" else "NO"
            println(result)
        }else{
            println("NO")
        }
    }
}