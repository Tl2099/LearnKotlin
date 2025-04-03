package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 1..100){
        for (test in 1..testNumber){
            val height = readln().toInt()
            println("Test $test: ")
            if(height < 1){
                println("ERROR")
            }else{
                for (i in 1..height){
                    for (j in 1..2 * height -1){
                        if(j >= (height - i + 1) && j <= (height + i - 1)){
                            print("${i - Math.abs(height - j)}".padEnd(3))
                        }else{
                            print(" ".repeat(3))
                        }
                    }
                    println()
                }
            }
        }
    }else{
        println("TEST AMOUNT MUST BE BETWEEN 1 AND 100")
    }
}