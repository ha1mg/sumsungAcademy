//internal abstract class Shape : Comparable<Shape> {
//    internal abstract fun area(): Double
//    override fun compareTo(s: Shape) = this.area().compareTo(s.area())
//}
//
//internal class Square(val a: Int) : Shape() {
//    override fun area() = (a * a).toDouble()
//}
//
//internal class Rect(val a: Int, val b: Int) : Shape() {
//    override fun area() = (a * b).toDouble()
//}
//
//fun main() {
//    val s = Square(1)
//    val r = Rect(10,5)
//    println(Square(1).area() + Rect(10,5).area())
//}