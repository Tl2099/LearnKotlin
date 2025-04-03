package Example.LearnThanTrieu.Chuong2.Bai7

import java.util.Stack

fun main() {
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        t--
        var n = readln().toInt()
        val isNegative = if (n < 0){
            n = -n
            true
        }else{
            false
        }
        print("Test ${testCounter++}: ")
        val stack = Stack<Int>()
        while (n > 0){
            val digit = n % 10
            n /= 10
            stack.push(digit)
        }
        if(isNegative){
            print("-")
        }
        while (!stack.isEmpty()){
            print("${stack.pop()}")
        }
        println()
    }
}