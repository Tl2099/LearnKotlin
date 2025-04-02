//package Example.ThayThanh_Kotlin
//
//class MonHoc1(soTC: Int, var diem: Diem1) {
//    var ten: String? = null
//
//    init {
//        diem.diemTK = soTC * diem.diemCoBan
//    }
//
//    class Diem1(var diemCoBan: Int) {
//        var diemTK: Int? = 0
//    }
//
//    override fun toString(): String {
//        return "$ten: ${diem.diemTK}"
//    }
//
//}
//
////fun main() {
////    val mh1 = MonHoc1(5, MonHoc1.Diem1(8))
////    mh1.ten = "Toán"
////    println(mh1)
////
////    val diem2 = MonHoc1.Diem1(8)
////    println(diem2.diemTK)
////}
//
////Cách 1:
//
//abstract class TuGiac{
//    open val name = "TuGíac"
//    open var dienTich: Double? = null
//    abstract fun tinhDienTich()
//
//    open val color = "Xanh"
//    open fun draw(){
//        println("Draw Tu Giasc by $color")
//    }
//
//    open fun print(){
//        println("Dien tich = $dienTich")
//    }
//}
//
//class HinhVuong(var doDaiCanh: Double) : TuGiac(){
//    override val name = super.name +" tiến hóa thành HinhVuong"
//    override var dienTich: Double? = null
//    override val color = "Đỏ"
//    override fun draw() {
//        println("Draw Hinh Vuong by $color")
//    }
//    override fun tinhDienTich() {
//        dienTich = doDaiCanh * doDaiCanh
//    }
//
//    override fun print() {
//        println(name)
//        println("Độ dài cạnh: $doDaiCanh")
//        super.print()
//    }
//
//    inner class Filter{
//        fun drawAndFill(){
//            draw()
//            println("Fill HV by color by the father class: " +super@HinhVuong.color)
//        }
//    }
//}
//
//fun main(){
//    val hv = HinhVuong(10.0)
//    hv.tinhDienTich()
//    hv.print()
//
//    val filter = hv.Filter()
//    filter.drawAndFill()
//}
//
//
//
//
//
//
//
//
////Cách 3:
//open class View(name: String) {
//    constructor(name: String, atts: String) : this(name)
//}
//
//class ChillView : View {
//    constructor(name: String) : super(name)
//    constructor(name: String, atts: String) : super(name, atts)
//}