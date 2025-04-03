package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main() {
    var t  = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val n = readln().toInt()
        println("Test ${testCounter++}: ")
        if(n > 0){
            val bound = sqrt(n.toDouble()).toInt()
            for (x in 1..bound){
                if (n % x == 0){
                    print("$x ")
                }
            }
            for (x in bound downTo 1){
                val other = n / x
                if(n % x == 0 && other != x ){
                    print("$other")
                }
            }
            println()
        }else{
            println("INVALID")
        }
    }
}