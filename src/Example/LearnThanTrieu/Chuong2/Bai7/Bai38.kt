package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.sqrt

fun main(){
    val testNumber = readln().toInt()
    if(testNumber in 1..100){
        for (test in 1..testNumber){
            val inputs = readln().split("\\s+".toRegex())
            val a = inputs[0].toInt()
            val b = inputs[1].toInt()
            println("Test $test: ")
            for (i in a..b){
                var isPrime: Boolean = true;
                val bound = sqrt(i.toDouble()).toInt()
                for (j in 2..bound){
                    if(i % j == 0){
                        isPrime = false;
                    }
                }
                if(isPrime && i >= 2){
                    print("$i ")
                }
            }
            println()
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}