package Example.ThayThanh_Kotlin

typealias OnCheck = (Int, Int) -> Boolean

fun main(){
    val ttCheck3: OnCheck = { a,b -> a < b }
    val ttCheck4: OnCheck = { a,b -> a == b }
    findCouple(5,6,ttCheck3)
    findCouple(5,6,ttCheck4)
}

fun findCouple(a: Int, b: Int, condition: OnCheck){
    val rs = condition(a,b)
    println("$a & $b " + (if (rs) "is" else "is not") + " couple!")
}