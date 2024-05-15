open class Shape(val name: String) {
    open fun calculatorArea(): Int {
        return 0
    }
}


class Rectangle(name: String, val w: Int, val h: Int) : Shape(name) {

    override fun calculatorArea(): Int {
        return w * h
    }
}


class Circle(name: String, val r : Int) : Shape(name){
    override fun calculatorArea(): Int {
        return (Math.PI * r * r).toInt()
    }
}

class Triangle(name: String, val b : Int, val h: Int) : Shape(name){
    override fun calculatorArea(): Int {
        return (0.5 * b * h).toInt()
    }
}

fun main() {


}

