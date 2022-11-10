abstract class Shape : Comparable<Shape>{
    abstract fun area(): Double
    override fun compareTo(other: Shape) = this.area().compareTo(other.area())
}
class Square(val a: Double) : Shape() {
    override fun area() = a * a
}

class Rect(val a: Double, val b: Double) : Shape() {
    override fun area() = a * b
}

class Circle(val r: Double) : Shape() {
    override fun area() = 3.14*r*r
    (x * 100).roundToInt() / 100.0
}