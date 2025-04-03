package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.abs

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for(test in 1..testNumber){
            val n = abs(readln().toInt())
            var m: Int = n
            var reversedN = 0
            print("Test $test: ")
            while (m > 0){
                reversedN = reversedN * 10 + m % 10
                m /= 10
            }
            if(reversedN == n && (n !in 0..9)){
                println("YES")
            }else{
                println("NO")
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}