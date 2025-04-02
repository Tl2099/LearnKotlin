package Example.LearnThanTrieu.Chuong3

fun main() {
    var choice: Int
    println("Nhap so khac 0 de tiep tuc")
    println("Nhap 0 de thoat.")
    do {
        val input = readln().split("\\s+".toRegex())
        choice = input[0].toInt()
        if (choice == 0){
            println("==> Chuong trinh ket thuc.")
            break
        }
        val day = input[1].toInt()
        val month = input[2].toInt()
        var zodiac: String
        when(month){
            1 -> zodiac = when (day) {
                in 1..19 -> "Ma Kết" // 1 - 19/1
                in 20..31 -> "Bảo Bình" // 20 - 31/1
                else -> "Ngày không hợp lệ"
            }

            2 -> zodiac = when (day) {
                in 1..19 -> "Bảo Bình" // 1 - 18/2
                in 20..29 -> "Song Ngư" // 19 - 29/2
                else -> "Ngày không hợp lệ"
            }

            3 -> zodiac = when (day) {
                in 1..21 -> "Song Ngư" // 1 - 20/3
                in 22..31 -> "Bạch Dương" // 21 - 31/3
                else -> "Ngày không hợp lệ"
            }

            4 -> zodiac = when (day) {
                in 1..21 -> "Bạch Dương" // 1 - 20/4
                in 22..30 -> "Kim Ngưu" // 21 - 30/4
                else -> "Ngày không hợp lệ"
            }

            5 -> zodiac = when (day) {
                in 1..21 -> "Kim Ngưu" // 1 - 20/5
                in 22..31 -> "Song Tử" // 21 - 31/5
                else -> "Ngày không hợp lệ"
            }

            6 -> zodiac = when (day) {
                in 1..22 -> "Song Tử" // 1 - 21/6
                in 23..30 -> "Cự Giải" // 22 - 30/6
                else -> "Ngày không hợp lệ"
            }

            7 -> zodiac = when (day) {
                in 1..23 -> "Cự Giải" // 1 - 22/7
                in 24..31 -> "Sư Tử" // 23 - 31/7
                else -> "Ngày không hợp lệ"
            }

            8 -> zodiac = when (day) {
                in 1..23 -> "Sư Tử" // 1 - 22/8
                in 24..31 -> "Xử Nữ" // 23 - 31/8
                else -> "Ngày không hợp lệ"
            }

            9 -> zodiac = when (day) {
                in 1..23 -> "Xử Nữ" // 1 - 22/9
                in 24..30 -> "Thiên Bình" // 23 - 30/9
                else -> "Ngày không hợp lệ"
            }

            10 -> zodiac = when (day) {
                in 1..24 -> "Thiên Bình" // 1 - 23/10
                in 25..31 -> "Bọ Cạp"  // 24 - 31/10
                else -> "Ngày không hợp lệ"
            }

            11 -> zodiac = when (day) {
                in 1..23 -> "Bọ Cạp" // 1 - 22/11
                in 24..30 -> "Nhân Mã" // 23 - 30/11
                else -> "Ngày không hợp lệ"
            }

            12 -> zodiac = when (day) {
                in 1..22 -> "Nhân Mã"  // 1 - 21/12
                in 23..31 -> "Ma Kết" // 22 - 31/12
                else -> "Ngày không hợp lệ"
            }

            else -> zodiac = "Tháng không hợp lệ. Vui lòng kiểm tra lại."
        }
        if (zodiac.isEmpty()){
            println(zodiac)
        }
    }while (true)
}