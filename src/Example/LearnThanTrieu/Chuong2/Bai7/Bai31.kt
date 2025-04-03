package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    val testNumber = readln().toInt()
    if (testNumber in 0..100){
        for (i in 1..testNumber){
            val inputs = readln().split("\\s+".toRegex())
            val a = inputs[0].toInt()
            val b = inputs[1].toInt()

            println("Test $i: ")
            var uscln: Int = -1;
            var bscnn: Int = -1;
            if(a == 0 && b == 0){
                print("ERROR ERROR\n")
            }else if(a == 0 || b == 0){
                uscln = a + b
                print("$uscln ERROR\n")
            }else{
                var aTmp = a
                var bTmp = b
                while (aTmp != bTmp){
                    if(aTmp > bTmp) aTmp -= bTmp
                    else bTmp -= aTmp
                }
                uscln = aTmp
                bscnn = (a * b) / uscln
                print("$uscln $bscnn\n")
            }
        }
    }else{
        println("INVALID TEST AMOUNT")
    }
}