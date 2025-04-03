package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.abs

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for(i in 1..testNumber){
            var n = abs(readln().toInt())
            var digit: Int = 0
            var sum: Int = 0
            println("Test $i: ")
            while (n > 0){
                digit = n % 10
                sum += digit * digit
                n /= 10
            }
            println("$sum")
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}