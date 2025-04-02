package Example.ThayThanh_Kotlin

fun main() {
    val a = 5
    if (a % 2 == 0) {
        println("A la so chan")
    } else {
        println("A la so le")
    }

    val kq = if (a % 2 == 0) "A la so chan" else "A la so le"
    println(kq)

    val arrInt = arrayOf(1,2,3,4,5,7,8)
    if(a in arrInt){
        println("A là số có 1 chữ số!")
    }
    if(a !in 1..9){
        println("A là số có 1 chữ số!")
    }
}