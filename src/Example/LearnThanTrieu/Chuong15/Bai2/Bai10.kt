package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Nhap so luong bo test: ")
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        val n = readln().toInt()
        println("Test $testCounter: ")
        listDivisors(n)
        t--
        testCounter++
    }
}
fun listDivisors(n: Int){
    if(n <= 0){
        println("INVALID")
    }else{
        for (number in 1..n){
            if(n % number == 0){
                print("$number")
            }
        }
        println()
    }
}