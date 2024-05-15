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


class circle(name: String, val )


fun main() {


}

