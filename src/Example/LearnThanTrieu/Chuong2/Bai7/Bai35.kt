package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (i in 1..testNumber){
            val n = readln().toIntOrNull()
            if((n==null) || (n<0) || (n>20)){
                println("ERROR")
            }else{
                var factorial: ULong = 1u
                for (_i in 1..n){
                    factorial *= _i.toULong()
                }
                println(factorial)
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}