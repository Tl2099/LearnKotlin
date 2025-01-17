package Example.LearnASequences


fun main() {
    //Khởi tạo mot Sequence vo han voi generateSequence
    val numbers = generateSequence(1) { it + 1 }
    //Lay 10 phan tu dau tien cua Sequence nay
    val firstTenNumbers = numbers.take(10).toList()
    //In ra danh sach so tu 1 den 10
    println(firstTenNumbers)
}