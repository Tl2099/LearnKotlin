package Example.ThayThanh_Kotlin

interface Comparable {
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
}

class So : Comparable

//SAM linh động hơn typealins
//Nó là interface nên có thể kế thừa các interface khác
//Nó có thể chứa thêm các phương thức không phải abstract
//Nó có thể có thuộc tính hằng

fun interface OnCondition {
    fun beforeCheck(number: Int): Boolean{
        return number > 0
    }
    fun check(a: Int, b: Int): Boolean
}

fun main() {
//    //Cach 1
//    val so  = So()
//    val max = so.max(10,8)
//    println("Max = $max")
//
//    //Cach 2
//    val anonymous = object : Comparable {}
//    val max2 = anonymous.max(10, 15)
//    println(max2)

    val ttCheck1 = object : OnCondition {
        override fun check(a: Int, b: Int): Boolean {
            return a > b
        }
    }
    val ttCheck2 = OnCondition { a, b -> a < b }
    val ttCheck3 = OnCondition { a, b -> a == b }

    findCouple(5,6,ttCheck2)
    findCouple(5,6,ttCheck3)

}

fun findCouple(a: Int, b: Int, condition: OnCondition) {
    if(!condition.beforeCheck(a) || !condition.beforeCheck(b)){
        println("a or b is not correct:")
        return
    }
    val rs = condition.check(a, b)
    println("$a & $b " + (if (rs) "is " else "is not") + " couple!")
}