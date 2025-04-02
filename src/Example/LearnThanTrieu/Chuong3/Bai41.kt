package Example.LearnThanTrieu.Chuong3

import kotlin.math.pow

fun main() {
    var choice: Int
    val inputStr = readln().split("\\s+".toRegex())
    val a = inputStr[0].toInt()
    val b = inputStr[1].toInt()
    println("Chon cac chuc nang: ")
    println("1. Cong hai so")
    println("2. Tru a cho b")
    println("3. Nhan a voi b")
    println("4. Chia a cho b")
    println("5. Chia lay du a cho b")
    println("6. Tinh a^b")
    println("0. Thoat")
    do {
        choice = readln().toInt()
        when (choice) {
            1 -> println("$a + $b = ${a + b}")
            2 -> println("$a - $b = ${a - b}")
            3 -> println("$a * $b = ${a * b}")
            4 -> {
                if (b== 0){
                    println("Khong the thuc hien phep chia")
                }else{
                    println("$a / $b = ${a.toFloat() / b}")
                }
            }
            5 -> {
                if(b == 0){
                    println("Khong the thuc hien phep chia")
                }else{
                    println("$a % $b = ${a % b}")
                }
            }
            6 -> println("$a^$b = ${a.toDouble().pow(a.toDouble())}")
            0 -> println("==> Ket thuc chuong trinh.")
            else -> println("Sai chuc nang. Vui long chon cac chuc nang tu 0-6")
        }
    } while (choice != 0)
}