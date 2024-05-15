//open class Shape {
//    open fun calculatorArea() {
//        println("default shape")
//    }
//}
//
//
//class Rectangle(val name: String, val w: Int, val h: Int) : Shape() {
//
//    override fun calculatorArea() {
//
//        println("|    $name area is ${w * h }    |")
//    }
//}
//
//
//class Circle(val name: String, val r: Int) : Shape() {
//    override fun calculatorArea()
//    {
//
//
//        println("|    $name area is ${(Math.PI * r * r).toInt()}    |")
//    }
//}
//
//class Triangle(val name: String, val b: Int, val h: Int) : Shape() {
//    override fun calculatorArea() {
//
//        println("|    $name area is ${(0.5 * b * h).toInt()}    |")
//    }
//}
//
//fun main() {
//
//
//    val rectangle = Rectangle("Rectangle", 6, 7)
//
//    val circle = Circle("Circle", 8)
//
//    val triangle = Triangle("Triangle", 6, 9)
//
//
//
//
//
//    println("|-------------------------------------------------------|")
//    println("|                                                       |")
//    println("|                                                       |")
//      Rectangle("Rectangle", 6, 7).calculatorArea()
//
//     Circle("Circle", 8).calculatorArea()
//
//     Triangle("Triangle", 6, 9).calculatorArea()
//
//    println("|                                                       |")
//    println("|                                                       |")
//    println("|-------------------------------------------------------|")
//}
//
//










//interface AreaCalculator {
//    fun calculateArea(): Double
//}
//
//class Rectangle(val name: String, val w: Int, val h: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculateArea()}    |")
//    }
//}
//
//class Circle(val name: String, val r: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculateArea()}    |")
//    }
//}
//
//class Triangle(val name: String, val b: Int, val h: Int, val areaCalculator: AreaCalculator) {
//    fun printArea() {
//        println("|    $name area is ${areaCalculator.calculateArea()}    |")
//    }
//}
//
//fun main() {
//    val rectangle = Rectangle("Rectangle", 6, 7)
//    val circle = Circle("Circle", 8)
//    val triangle = Triangle("Triangle", 6, 9)
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
//





















//I've defined the AreaCalculator interface with a single method calculateArea().
//Each shape class (Rectangle, Circle, Triangle) now accepts an AreaCalculator in its constructor instead of subclassing Shape.
//The lambda expressions passed to the constructors of the shapes represent the area calculation logic.
//The printArea() method in each shape class invokes calculateArea() on the provided AreaCalculator and prints the result.
//In the main() function, I've created instances of each shape by passing appropriate lambda expressions to calculate their areas. Then, I've printed their areas using the printArea() method.

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
