package Example.LearnThanTrieu.Chuong2.Bai7

import kotlin.math.abs

fun main() {
    println("Nhap so luong bo test: ")
    val t = readln().toInt()
    for(i in 1..t){
        val n = abs(readln().toInt())
        var m = n
        var reverM = 0
        while (m > 0){
            reverM = reverM * 10 + m % 10
            m /= 10
        }
        val result = if (reverM == n){
            "Test $i: YES"
        }else{
            "Test $i: NO"
        }
        println(result)
    }
}