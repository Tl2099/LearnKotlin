package Example.LearnThanTrieu.Chuong3

fun main() {
    var choice: Int
    println("Nhap thang (1-12)")
    println("Nhap 0 de thoat: ")
    do {
        choice = readln().toInt()
        when(choice){
            0 -> println("Chuong trinh ket thuc.")
            1 -> println("January")
            2 -> println("February")
            3 -> println("March")
            4 -> println("April")
            5 -> println("May")
            6 -> println("June")
            7 -> println("July")
            8 -> println("August")
            9 -> println("September")
            10 -> println("October")
            11 -> println("November")
            12 -> println("December")
            else -> println("Thang khong hop le. Vui long kiem tra lai!")
        }
    }while (choice != 0)
}