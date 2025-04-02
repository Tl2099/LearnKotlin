package Example.LearnThanTrieu.Chuong3

fun main() {
    val testNumber = readln().toInt()
    if(testNumber in 1..100){
        for (test in 1..testNumber){
            val inputs = readln().split("\\s+".toRegex())
            val a = inputs[0].toInt()
            val b = inputs[1].toInt()
            val k = inputs[2].toInt()
            println("Test $test: ")

            if(k == 0){
                println("ERROR")
                continue
            }
            for (i in a..b){
                if (i % k == 0){
                    print("$i ")
                }
            }
            println()
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}