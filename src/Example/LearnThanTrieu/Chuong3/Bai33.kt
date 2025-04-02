package Example.LearnThanTrieu.Chuong3

import kotlin.math.abs

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (i in 1..testNumber){
            var n = abs(readln().toInt())
            if (n >= 2){
                var a = 2
                while (n != 1){
                    if (n % a == 0){
                        print("$a${if (a != n) " x " else " "}")
                        n /= a
                    }else{
                        a++
                    }
                }
                println()
            }else{
                println("ERROR")
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}