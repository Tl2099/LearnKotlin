package Example.LearnThanTrieu.Chuong15.Bai2

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    println("Nhap hais so nguyen a < b cach nhau boi dau cach: ")
    val input = readln().split("\\s+".toRegex())
    val a = input[0].toInt()
    val b = input[1].toInt()
    showPrimes(a, b)
    showSquares(a, b)
    showPalindromes(a, b)
    showSumDigitsPrimes(a, b)
}

fun showPrimes(a: Int, b: Int) {
    var counter = 0
    println("Cac so nguyen to trong [$a, $b]: ")
    for (number in a..b) {
        if (isPrime1(number)) {
            print("$number")
            counter++
            if (counter % 10 == 0) {
                println()
            }
        }
    }
    if (counter == 0) {
        println("Khong co so nao thoa man")
    } else {
        println()
    }
}

fun showSquares(a: Int, b: Int) {
    var counter = 0
    println("Cac so chinh phuong trong [$a, $b]:")
    for (number in a..b) {
        if (isSquare(number)) {
            print("$number")
            counter++
            if (counter % 10 == 0) {
                println()
            }
        }
    }
    if (counter == 0) {
        println("Khong co so nao thoa man")
    } else {
        println()
    }
}

fun showPalindromes(a: Int, b: Int) {
    var counter = 0
    println("Cac so thuan nghich trong [$a, $b]: ")
    for (number in a..b) {
        if (isPalindrome1(number)) {
            print("$number")
            counter++
            if (counter % 10 == 0) {
                println()
            }
        }
    }
    if (counter == 0) {
        println("Khong co so nao thoa man")
    } else {
        println()
    }
}

fun showSumDigitsPrimes(a: Int, b: Int) {
    var counter = 0
    println("Cac so co tong chu so nguyen to trong [$a, $b]: ")
    for (number in a..b) {
        if (isSumDigitsPrime1(number)) {
            print("$number")
            counter++
            if (counter % 10 == 0) {
                println()
            }
        }
    }
    if (counter == 0) {
        println("Khong co so nao thoa man")
    } else {
        println()
    }
}

private fun isSquare(n: Int): Boolean {
    val s = sqrt(n.toFloat()).toInt()
    return s * s == n
}

private fun isPrime1(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    val bound = sqrt(n.toFloat()).toInt()
    for (i in 2..bound) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

private fun isPalindrome1(n: Int): Boolean {
    var rev = 0
    var number = abs(n)
    while (number > 0) {
        rev = rev * 10 + number % 10
        number /= 10
    }
    return rev == abs(n)
}

private fun isSumDigitsPrime1(n: Int): Boolean {
    var sum = 0
    var number = abs(n)
    while (number > 0) {
        sum += number % 10
        number /= 10
    }
    return isPrime(sum)
}