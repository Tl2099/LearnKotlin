package Example.LearnThanTrieu.Chuong3

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (test in 1..testNumber){
            val n = readln().toInt()
            println("Test $test: ")
            if(n <= 0){
                println("ERROR")
            }else{
                var sum = 0.0
                var i = 1
                while (i <= n){
                    sum += 1.0 / (i * i * i)
                    i++
                }
                println(String.format("%.3f", sum).toDouble())
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}