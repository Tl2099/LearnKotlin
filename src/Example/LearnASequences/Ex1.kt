package Example.LearnASequences


//Khởi tạo một Sequence từ List
fun main() {
    val numbers = listOf(1,2,3,4,5)
    //Chuyen List thanh Sequence
    val numberSequence = numbers.asSequence()
    //Ap dung cac thao tac luoi bieng nhu map va filter
    val result = numberSequence
        .map { it * 2 } //Nhan moi phan tu voi 2
        .filter { it > 5 } // Loc ra cac phan tu lon hon 5
    //Chuyen doi ket qua thanh List de hien thi
    println(result.toList())
}