package Example.LearnThanTrieu.Chuong3

fun main() {
    var choice: Int
    println("Nhap thang (1-12)")
    println("Nhap 0 de thoat: ")
    do{
        choice = readln().toInt()
        val result = when(choice){
            0 -> "==> Chương trình kết thúc."
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "ERROR"
        }
    }while (choice != 0)
}