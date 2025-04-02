package Example.LearnThanTrieu.Chuong3

import kotlin.math.sqrt

fun main() {
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val n = readln().toInt()
        print("Test ${testCounter++}: ")
        if(n > 0){
            var sum = 0
            val bound = sqrt(n.toDouble()).toInt()
            for (x in 1..bound){
                if (n % x == 0){
                    sum += x
                }
            }
            for (x in bound downTo 1){
                val other = n / x
                if (n %x == 0 && other != x){
                    sum += other
                }
            }
            sum -= n
            val result = if (sum == n) "YES" else "NO"
            println(result)
        }else{
            println("NO")
        }
    }
}