package Example.LearnThanTrieu.Chuong3

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (test in 1..testNumber){
            val input = readln().split(" ").map { it.toInt() }
            val m = input[0]
            val n = input[1]
            println("Test $test:")
            if(m <= 0 || n <= 0){
                println("ERROR")
            }else{
                for (i in 1..m){
                    for (j in 1..n){
                        print("${i + j - 1}")
                    }
                    println()
                }
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}