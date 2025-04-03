package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    val m = 7
    val n = 6
    for (i in 1..n){
        for (j in 1..m){
            if(((i != 2 && i != 3) && (j == 1 || j == 7)) || (i == 1 && j == 4) || (i >= 5 && (j == 2 || j == 6)) || (i == 6 && (j == 3 || j == 5))){
                print("   ")
            }else{
                print(" * ")
            }
        }
        println()
    }
}