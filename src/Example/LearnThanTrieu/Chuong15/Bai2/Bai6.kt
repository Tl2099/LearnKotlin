package Example.LearnThanTrieu.Chuong15.Bai2

import kotlin.math.sqrt

fun main() {
    println("Nhap mot so nguyen duong n: ")
    val n = readln().toInt()
    nextPrime(n)
    previousPrime(n)
    sliceToPrime1(n)
    sliceToPrime2(n)
    println("Nhap so k thoa man 1 <= k <= 8: ")
    val k = readln().toInt()
    listAllPrimes(n ,k)
}

fun listAllPrimes(n: Int, k: Int){
    if (k < 1 || k > 8){
        println("$k khong hop le")
    }else{
        println("Cac so nguyen to thoa man: ")
        val leftBound = pow(10, k - 1).toInt() + 1
        val rightBound = pow(10, k) - 1
        var number = leftBound
        var counter = 0
        while (number < rightBound){
            if(isPrime(number)){
                print("$number")
                counter++
                if(counter == n){
                    break
                }
                if(counter % 10 == 0){
                    println()
                }
            }
            number += 2
        }
    }
}

fun previousPrime(n: Int){
    if(n <= 2){
        println("NOT AVAILABLE")
    }else{
        var number = n - 1
        while (true){
            if(isPrime(number)){
                println("So nguyen to lien truoc 4n: $number")
                break
            }
            number--
        }
    }
}

fun nextPrime(n: Int){
    println("So nguyen to ke tiep cua $n: ")
    var number = n + 1
    while (true){
        if (isPrime2(number)){
            println(number)
            break
        }
        number++
    }
}

private fun isPrime2(n: Int): Boolean{
    if(n < 2){
        return false
    }
    val bound = sqrt(n.toFloat()).toInt()
    for (i in 2..bound){
        if (n % i == 0){
            return false
        }
    }
    return true
}
fun sliceToPrime1(n: Int){
    println("Phan tich thua so nguyen to: ")
    print("$n = ")
    var number = n
    var prime = 2
    while (!isPrime(number)){
        if(number % prime == 0){
            print("$prime x ")
            number /= prime
        }else{
            prime++
        }
    }
    println(number)
}

fun sliceToPrime2(n: Int){
    println("Phan tich thua so nguyen to dang so mu: ")
    print("$n = ")
    var number = n
    var prime = 2
    var prev = prime
    var counter = 0
    while (number > 1){
        if(number % prime == 0){
            prev = prime
            counter++
            number /= prime
        }else{
            prime++
            if(counter > 0){
                if (counter == 1){
                    println("$prev x ")
                }else{
                    print("$prev^$counter x ")
                }
                counter = 0
            }
        }
    }
    if(counter > 0){
        if(counter == 1){
            println("$prev")
        }else{
            println("$prev^$counter")
        }
    }
}
