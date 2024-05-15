interface AreaCalculator {
    fun calculatorArea() {
        println("default area")
    }




}

class Rectangle(val name: String, val w: Int, val h: Int, val areaCalculator: AreaCalculator) {
    fun printArea() {
        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
    }
}

class Circle(val name: String, val r: Int, val areaCalculator: AreaCalculator) {
    fun printArea() {
        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
    }
}

class Triangle(val name: String, val b: Int, val areaCalculator: AreaCalculator) {
    fun printArea() {
        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
    }
}


//class RectangleAreaCalculator(private val width: Int, private val height: Int) : AreaCalculator {
//    override fun calculatorArea(): Int {
//        return width.toInt() * height.toInt()
//    }


fun main() {


    val rectangle = Rectangle("Rectangle", 6,  7)
    val circle = Circle("Circle", 8)
    val triangle = Triangle("Triangle", 6, 9)

    println("|-------------------------------------------------------|")
    println("|                                                       |")
    println("|                                                       |")

    rectangle.printArea()
    circle.printArea()
    triangle.printArea()

    println("|                                                       |")
    println("|                                                       |")
    println("|-------------------------------------------------------|")

}


//
//







































//
//interface AreaCalculator {
//    fun calculatorArea(): Double // Define a return type for calculatorArea
//}
//
//class Rectangle(val name: String, val w: Int, val h: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
//    }
//}
//
//class Circle(val name: String, val r: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
//    }
//}
//
//class Triangle(val name: String, val b: Int, val h: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculatorArea()}    |")
//    }
//}
//
//class RectangleAreaCalculator(private val width: Int, private val height: Int) : AreaCalculator {
//    override fun calculatorArea(): Double {
//        return width.toDouble() * height.toDouble()
//    }
//}
//
//class CircleAreaCalculator(private val radius: Int) : AreaCalculator {
//    override fun calculatorArea(): Double {
//        return Math.PI * radius.toDouble() * radius.toDouble()
//    }
//}
//
//class TriangleAreaCalculator(private val base: Int, private val height: Int) : AreaCalculator {
//    override fun calculatorArea(): Double {
//        return 0.5 * base.toDouble() * height.toDouble()
//    }
//}
//
//fun main() {
//    val rectangle = Rectangle("Rectangle", 6, 7, RectangleAreaCalculator(6, 7))
//    val circle = Circle("Circle", 8, CircleAreaCalculator(8))
//    val triangle = Triangle("Triangle", 6, 9, TriangleAreaCalculator(6, 9))
//
//    println("|-------------------------------------------------------|")
//    println("|                                                       |")
//    println("|                                                       |")
//
//    rectangle.printArea()
//    circle.printArea()
//    triangle.printArea()
//
//    println("|                                                       |")
//    println("|                                                       |")
//    println("|-------------------------------------------------------|")
//}
