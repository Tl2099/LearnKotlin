package Example.LearnThanTrieu.Chuong15.Bai1

//Tim hieu ve Hilt
//Vi du khi khong can d
class Engine {
    fun start() {
        println("Engine is starting...")
    }
}

class Car() {
//    private lateinit var engine: Engine
//
//    fun setEngine(engine: Engine) {
//        this.engine = engine
//    }
    lateinit var engine: Engine

    fun start() {
        engine.start()
    }
}

fun main() {
    val engine = Engine()
    val car = Car()
    //car.setEngine(engine)
    car.engine = engine
    car.start()
}