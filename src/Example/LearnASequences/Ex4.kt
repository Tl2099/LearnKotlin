package Example.LearnASequences


fun main() {
    val numbers = sequenceOf(1,2,3,4,5)
    //Tinh tong cac so trong sequence
    val sum = numbers.reduce{acc,number -> acc+number}
    println(sum)
}