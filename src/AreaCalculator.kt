fun interface AreaCalculator {
    fun calculatorArea()
}

class Rectangle(val name: String, val width: Int, val height: Int) {

    fun printArea() {

        val area = AreaCalculator {
            println("|    $name area is ${width*height}    |")
        }

        area.calculatorArea()


    }

}

class Circle(val name: String, val radius: Int) {
    fun printArea() {
        val area =  AreaCalculator {
            println("|    $name area is ${Math.PI*(radius*radius)}    |")
        }
        area.calculatorArea()

    }
}

class Triangle(val name: String, val base: Int, val height: Int) {
    fun printArea() {
        val area =    AreaCalculator {
            println("|    $name area is ${0.5*(base*height)}    |")
        }
        area.calculatorArea()
    }
}

































