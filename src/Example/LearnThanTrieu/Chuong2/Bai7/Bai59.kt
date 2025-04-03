package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    println("Nhap so luong bo test: ")
    var t = readln().toInt()
    var testCounter = 1
    while (t > 0){
        t--
        val inputs = readln().split("\\s+".toRegex())
        val height = inputs[0].toInt()
        val width = inputs[1].toInt()
        val start = inputs[2].toInt()
        println("Test ${testCounter++}: ")
        if(width <= 0 || height <= 0){
            println("ERROR")
        }else{
            val rect = Array(height) { Array(width) { 0 } }
            var current = start
            for (i in 0 until width){
                rect[0][i] = current++
            }
            for (i in 1 until height){
                rect[i][width-1] = current++
            }
            if (height > 1) {
                for (i in width - 2 downTo 0){
                    rect[height - 1][i] = current++
                }
            }
            if(width > 1){
                for (i in height - 2 downTo 1){
                    rect[i][0] = current++
                }
            }

            for (row in rect){
                for (item in row){
                    if(item == 0){
                        print("%-5s".format("."))
                    }else{
                        print("%-5s".format(item))
                    }
                }
                println()
            }
        }
    }
}