fun main() {
    val dnk = readln()
    var (a,t,g,c) = arrayOf(0,0,0,0)
    for (char in dnk.indices) {
        when (dnk[char]) {
            'A' -> a++
            'T' -> t++
            'G' -> g++
            'C' -> c++
        }
    }
    println("$a $t $g $c")
}

