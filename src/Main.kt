open class Shape {
    open fun calculatorArea() {
        println("default shape")
    }
}


class Rectangle(val name: String, val w: Int, val h: Int) : Shape() {

    override fun calculatorArea() {

        println("|    $name area is ${w * h }    |")
    }
}


class Circle(val name: String, val r: Int) : Shape() {
    override fun calculatorArea()
    {


        println("|    $name area is ${(Math.PI * r * r).toInt()}    |")
    }
}

class Triangle(val name: String, val b: Int, val h: Int) : Shape() {
    override fun calculatorArea() {

        println("|    $name area is ${(0.5 * b * h).toInt()}    |")
    }
}

fun main() {


    val rectangle = Rectangle("Rectangle", 6, 7)

    val circle = Circle("Circle", 8)

    val triangle = Triangle("Triangle", 6, 9)




//    println("|-------------------------------------------------------|")
//    println("|                                                       |")
//    println("|                                                       |")
//    println("|    Rectangle area is ${rectangle.calculatorArea()}    |")
//    println("|    Circle area is ${circle.calculatorArea()}          |")
//    println("|    Triangle area is ${triangle.calculatorArea()}      |")
//    println("|                                                       |")
//    println("|                                                       |")
//    println("|-------------------------------------------------------|")

    println("|-------------------------------------------------------|")
    println("|                                                       |")
    println("|                                                       |")
      Rectangle("Rectangle", 6, 7).calculatorArea()

     Circle("Circle", 8).calculatorArea()

     Triangle("Triangle", 6, 9).calculatorArea()

    println("|                                                       |")
    println("|                                                       |")
    println("|-------------------------------------------------------|")
}



