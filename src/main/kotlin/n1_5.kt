interface Movable {
    fun move( dx: Int, dy: Int)
}

open class Point(var x:Int, var y:Int) : Movable{
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }
}

internal class CloudOfPoints(val points: ArrayList<Point>) : Movable{
    override fun move(dx: Int, dy: Int) {
        points.forEach {
            it.move(dx, dy)
        }
    }
}