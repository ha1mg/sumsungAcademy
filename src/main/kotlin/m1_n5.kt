//fun main() {
//    val size = readln().toInt()
//    if (size < 1) {
//        println(0)
//    } else {
//        val nums = readln().split(" ").map{it.toInt()}
//        println(nums)
//        var controlSum = 0
//        for (n in nums) controlSum = (controlSum + n) * 113 % 10000007
//        println(controlSum)
//    }
//}

import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    var controlSum = 0
    for (n in arr) controlSum = (controlSum + n) * 113 % 10000007
    println(controlSum)
}