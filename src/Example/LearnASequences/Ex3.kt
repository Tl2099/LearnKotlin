package Example.LearnASequences


fun main() {
    val numbers = (1..10).asSequence()
    //Chi loc va tinh toan cac phan tu khi can
    val result = numbers
        .filter { it % 2 == 0 } //Lọc các số chẵn
        .map { it * it } // Bình phương các so chan

    println(result.toList())
}