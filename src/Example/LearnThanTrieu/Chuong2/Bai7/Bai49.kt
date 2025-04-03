package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main() {
    var t = readln().toInt()
    var testCounter = 1
    while(t > 0){
        t--
        var primeCounter = 0
        val input = readln().split("\\s+".toRegex())
        val a = input[0].toInt()
        val b = input[1].toInt()
        val k = input[2].toInt()
        if(k <= 0){
            println("Test ${testCounter++}: ERROR")
        }else{
            print("Test ${testCounter++}: ")
            for (item in a..b){
                val bound = sqrt(item.toDouble()).toInt()
                var isPrime: Boolean
                if(item >= 2){
                    isPrime = true
                    for (number in 2..bound){
                        if(item % number == 0){
                            isPrime = false
                            break
                        }
                    }
                }else{
                    isPrime = false
                }
                if(isPrime && primeCounter < k){
                    print("$item ")
                    primeCounter++
                }
            }
            if(primeCounter == 0){
                println("NO RESULT")
            }else{
                println()
            }
        }
    }
}