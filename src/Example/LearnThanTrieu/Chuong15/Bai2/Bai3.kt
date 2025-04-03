package Example.LearnThanTrieu.Chuong15.Bai2

import kotlin.math.abs

fun main() {
    println("Nhap vao mot so nguyen duong :")
    val n = readln().toLong()
    println("Tong cac chu so cua $n: ${sumDigits(n)}")
    println("Tich cac chu so cua $n: ${productDigits(n)}")
    println("Chu so dau tien cua $n: ${firstDigit(n)}")
}

fun sumDigits(n: Long): Int{
    var sum = 0
    var x = abs(n)
    while (x > 0){
        sum += (x % 10).toInt()
        x /= 10
    }
    return sum
}

fun productDigits(n: Long): Long{
    var product = 1L
    var x = abs(n)
    while (x > 0){
        product *= (x % 10)
        x /= 10
    }
    return product
}

fun firstDigit(n: Long): Int{
    var number = abs(n)
    while (number > 10){
        number /= 10
    }
    return number.toInt()
}