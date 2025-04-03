package Example.LearnThanTrieu.Chuong15.Bai2

fun main() {
    println("Nhap so thuc x: ")
    val x = readln().toFloat()
    println("So nguyen gan nhat nho hon $x: ${integerLessThanX(x)}")
    println("So nguyen gan nhat lon hon $x: ${integerGreterThanX(x)}")
    println("Gia tri tuyet doi cua $x: ${findAbs(x)}")
}

fun integerLessThanX(x: Float): Int{
    return x.toInt()
}

fun integerGreterThanX(x: Float): Int{
    return x.toInt()+1
}

fun findAbs(x: Float): Float{
    return if(x < 0){
        x * -1
    }else{
        x
    }
}