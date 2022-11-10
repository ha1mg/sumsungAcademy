fun main(args: Array<String>) {
    val r = Robot(0,1,Direction.UP)
    moveRobot(r, 3, 7)
    println("${r.x} ${r.y}")
}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

fun moveRobot(robot: Robot, toX: Int, toY: Int) {
    val dX = toX - robot.x
    val dY = toY - robot.y

    if (dX > 0) while (robot.direction != Direction.RIGHT) robot.turnLeft()
    else while (robot.direction != Direction.LEFT) robot.turnLeft()

    while(toX != robot.x) robot.stepForward()

    if (dY > 0) while (robot.direction != Direction.UP) robot.turnLeft()
    else while (robot.direction != Direction.DOWN) robot.turnLeft()

    while(toY != robot.y) robot.stepForward()
}

class Robot(x:Int, y:Int, dir:Direction) {
    var x:Int = x
        private set
    var y:Int = y
        private set
    var direction:Direction = dir
        private set

    fun turnLeft(){
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.LEFT -> Direction.DOWN
            Direction.RIGHT -> Direction.UP
        }
    }

    fun turnRight(){
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
            Direction.RIGHT -> Direction.DOWN
        }
    }

    fun stepForward(){
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.LEFT -> x--
            Direction.RIGHT -> x++
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}
