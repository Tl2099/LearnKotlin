package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.abs

fun main() {
    var t = readln().toInt()
    var testNumber = 1
    while (t > 0){
        val input = readln().split("\\s+".toRegex())
        var n = abs(input[0].toInt())
        val k = input[1].toInt()
        if(k > 0){
            var sum = 0
            while (n > 0){
                val digit = n % 10
                if(digit <= k){
                    sum += digit
                }
                n /= 10
            }
            println("Test ${testNumber++}: $sum")
        }else{
            println("Test ${testNumber++}: ERROR")
        }
    }
}