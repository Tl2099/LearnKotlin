package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Enter two positive integer numbers split by a space: ")
    val input = readln().split("\\s+".toRegex())
    val a = input[0].toInt()
    val b = input[1].toInt()
    println("GCD of ($a, $b): ${gcd(a,b)}")
    println("LCM of ($a, $b): ${lcm(a,b)}")
}

fun lcm(a:Int, b:Int) = a * b / gcd(a,b)

fun gcd(a:Int, b:Int):Int{
    var localA = a
    var localB = b
    while (localA != localB){
        if(localA > localB){
            localA -= localB
        }else{
            localB -= localA
        }
    }
    return localA
}