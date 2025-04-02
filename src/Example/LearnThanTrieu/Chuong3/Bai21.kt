package Example.LearnThanTrieu.Chuong3

fun main() {
    //Cách 1: Làm bình thường
//    println("Nhập số bộ test: ")
//    val t = readln().toInt()
//    for (i in 1..t) {
//        println("Nhập số n")
//        val n = readln().toInt()
//        println("Nhập số nguyên k")
//        val k = readln().toInt()
//        if (n < 0 || k <= 0 || n > 1e9 || k > 1e9) {
//            print("Test $i:\nINVALID")
//        } else {
//            println("Test $i:")
//            for (j in 1..n) {
//                if (j % k == 0) {
//                    print("$j ")
//                }
//            }
//        }
//        println()
//    }
    println("Nhập số lượng bộ test: ")
    val t = readln().toInt()
    for (i in 1..t){
        val inputs = readln().split("\\s+".toRegex())
        val n = inputs[0].toInt()
        val k = inputs[1].toInt()
        if(n < 0 || k <= 0 || n > 1e9 || k > 1e9){
            println("Test $i:\nINVALID")
        }else{
            println("Test $i:")
            for (j in k..n){
                if(j %k == 0){
                    print("$j")
                }
            }
            println()
        }
    }
}