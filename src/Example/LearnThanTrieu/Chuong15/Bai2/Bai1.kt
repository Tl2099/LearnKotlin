package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Enter two numbers split by a space: ")
    val input = readln().split("\\s+".toRegex())
    val a = input[0].toInt()
    val b = input[1].toInt()
    println("$a + $b = ${add(a, b)}")
    println("$a - $b = ${sub(a, b)}")
    println("$a * $b = ${mul(a, b)}")
    println("$a / $b = ${div(a, b)}")
    println("$a ^ $b = ${pow(a, b)}")

}

fun add(a: Int, b: Int) = a + b
fun sub(a: Int, b: Int) = a - b
fun mul(a: Int, b: Int) = a * b
fun div(a: Int, b: Int) = if (b == 0) throw ArithmeticException("Divide by zero") else a / b.toDouble()
fun pow(a: Int, b: Int) = Math.pow(a.toDouble(), b.toDouble()).toLong()