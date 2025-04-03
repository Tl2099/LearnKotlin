package Example.LearnThanTrieu.Chuong2.Bai7

fun main() {
    var choice: Int
    println("Nhap ngay (1-7)")
    println("Nhap 0 de thoat: ")
    do {
        choice = readln().toInt()
        when(choice){
            0 -> println("Chuong trinh ket thuc.")
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            7 -> println("Sunday")
            else -> println("Gia tri khong hop le. Vui long kiem tra lai!")
        }
    }while (choice != 0)
}