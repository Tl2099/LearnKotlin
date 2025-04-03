package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (test in 1..testNumber){
            val input = readln()
            val number = input.split("\\s+".toRegex())
            if(number.size == 2 && number.all { it.toInt() > 0 && it.toInt() >= 2 }){
                var a = number[0].toInt()
                var b = number[1].toInt()
                val aUpperBound = sqrt(a.toDouble()).toInt()
                val bUpperBound = sqrt(b.toDouble()).toInt()
                var isPrimeNumber = true
                var i = 2
                while (i <= aUpperBound){
                    if(a % i == 0){
                        isPrimeNumber = false
                        break
                    }
                    i++
                }
                var _i = 2
                while (_i <= bUpperBound){
                    if(b % _i == 0){
                        isPrimeNumber = false
                        break
                    }
                    _i++
                }
                var result = ""
                result = if (isPrimeNumber) "YES" else "NO"
                println(result)
            }else{
                println("NO")
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}