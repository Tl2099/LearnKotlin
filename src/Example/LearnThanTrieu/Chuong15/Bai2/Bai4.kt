package Example.LearnThanTrieu.Chuong15.Bai2

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    println("Nhap mot so nguyen n: ")
    val n = readln().toInt()
    println("$n la so nguyen to? ${isPrime(n)}")
    println("$n la so thuan nghich? ${isPalindrome(n)}")
    println("So dao cua $n la so nguyen to? ${isRevertPrime(n)}")
    println("Tong cac chu so cua $n la so nguyen to? ${isSumDigitsPrime(n)}")
}
fun isPrime(n:Int): Boolean{
    if(n < 2){
        return false
    }
    val bound = sqrt(n.toFloat()).toInt()
    for (i in 2..bound){
        if(n % i == 0){
            return false
        }
    }
    return true
}

fun isPalindrome(n: Int): Boolean{
    var rev = 0
    var number = abs(n)
    while (number > 0){
        rev = rev * 10 + number % 10
        number /= 10
    }
    return rev == abs(n)
}

fun isRevertPrime(n: Int): Boolean{
    var rev = 0
    var number = abs(n)
    while (number > 0){
        rev = rev * 10 + number % 10
        number /= 10
    }
    return isPrime(rev)
}

fun isSumDigitsPrime(n: Int): Boolean{
    var sum = 0
    var number = abs(n)
    while (number > 0){
        sum += number % 10
        number /= 10
    }
    return isPrime(sum)
}